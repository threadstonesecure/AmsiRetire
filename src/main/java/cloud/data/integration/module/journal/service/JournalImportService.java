package cloud.data.integration.module.journal.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import cloud.data.integration.common.bipublisher.reportservice.webservice.AccessDeniedException_Exception;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ArrayOfParamNameValue;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ArrayOfString;
import cloud.data.integration.common.bipublisher.reportservice.webservice.InvalidParametersException_Exception;
import cloud.data.integration.common.bipublisher.reportservice.webservice.OperationFailedException_Exception;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ParamNameValue;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ParamNameValues;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ReportDefinition;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ReportRequest;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ReportResponse;
import cloud.data.integration.common.bipublisher.reportservice.webservice.ReportService;
import cloud.data.integration.common.erpintegrationservice.webservice.DocumentDetails;
import cloud.data.integration.common.erpintegrationservice.webservice.ErpIntegrationService;
import cloud.data.integration.common.erpintegrationservice.webservice.EssJob;
import cloud.data.integration.common.erpintegrationservice.webservice.ObjectFactory;
import cloud.data.integration.common.journalimport.webservice.GlInterfaceTransHeader;
import cloud.data.integration.common.journalimport.webservice.ServiceException;
import cloud.data.integration.common.journalimport.webservice.ServiceViewInfo;
import cloud.data.integration.common.service.FusionCloudDataIntegrationService;
import cloud.data.integration.common.util.CommonMethods;
import cloud.data.integration.common.util.MailManager;
import cloud.data.integration.module.journal.JournalApp;
import cloud.data.integration.module.journal.exception.JournalImportException;
import cloud.data.integration.module.journal.model.JournalCSVColumnMapping;
import cloud.data.integration.module.journal.report.jaxb.journalCategory.JOURNALCATEGORYDATA.GENERALLEDGERJOURNALCATEGORY;
import cloud.data.integration.module.journal.report.jaxb.journalSource.JOURNALSOURCEDATA.GENERALLEDGERJOURNALSOURCE;
import cloud.data.integration.module.journal.report.jaxb.ledger.DATADS;
import cloud.data.integration.module.journal.util.JournalUtil;
import gov.stcroix.journalimport.client.CatalogService;
import gov.stcroix.journalimport.client.ServiceCatalogService;

/**
 * SBalawatri
 */
public class JournalImportService {
	
	final static Logger logger = Logger.getLogger(JournalImportService.class);
	
	public String uploadFileToFusion(String fileName,String customFile) throws 
		cloud.data.integration.common.erpintegrationservice.webservice.ServiceException, 
		IOException {
		
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		ObjectFactory objectFactory = new ObjectFactory();
		
		File zipFile = new File(fileName);
		
		//UploadFileToUcm uploadFile = objectFactory.createUploadFileToUcm();
		DocumentDetails documentDetails = objectFactory.createDocumentDetails();
		
		JAXBElement<String> documentTitle = objectFactory.
				createDocumentDetailDocumentTitle(zipFile.getName());
		documentDetails.setDocumentTitle(documentTitle);
		
		JAXBElement<String> documentAuthor = objectFactory.
				createDocumentDetailDocumentAuthor(JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		documentDetails.setDocumentAuthor(documentAuthor);
		
		JAXBElement<String> documentId = objectFactory.createDocumentDetailDocumentId("1000");
		documentDetails.setDocumentId(documentId);
		
		JAXBElement<String> documentContentType = objectFactory.createDocumentDetailContentType("zip");
		documentDetails.setContentType(documentContentType);
		
		JAXBElement<String> documentSecurityGroup = objectFactory.
				createDocumentDetailDocumentSecurityGroup("FAFusionImportExport");
		documentDetails.setDocumentSecurityGroup(documentSecurityGroup);
		
		JAXBElement<String> documentAccount = objectFactory.
				createDocumentDetailDocumentAccount("fin$/assets$/import$");
		documentDetails.setDocumentAccount(documentAccount); 
		
		
		documentDetails.setFileName(zipFile.getName());
		
		//File fileToUpload = new File(fileName);
		logger.debug("customFile"+customFile);
		String zipDirectoryPath = JournalUtil.getPropertyValue("JOURNAL_ZIP_DIRECTORY_NAME",customFile);
		logger.debug("zipDirectoryPath "+ zipDirectoryPath);
		String zipFileName = JournalUtil.getPropertyValue("JOURNAL_ZIP_FILE_NAME",customFile);
		Path filePath = FileSystems.getDefault().getPath(zipDirectoryPath, zipFileName);
		byte[] documentContent = null;

		documentContent = Files.readAllBytes(filePath);
		if(documentContent==null || documentContent.length==0) {
			
			logger.debug("documentContent"+ documentContent.length);
		}
		documentDetails.setContent(documentContent);

		String serverReturnedDocId = null;
	
		serverReturnedDocId = erpService.uploadFileToUcm(documentDetails);
		logger.debug("Server Returned Document Id: " + serverReturnedDocId);
		return serverReturnedDocId;
	}
	
	public long submitESSJobRequestForInterfaceLoader(String documentId) throws cloud.data.integration.common.erpintegrationservice.webservice.ServiceException {
		
		long essJobStatusId = 0;
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		String jobPackageName="/oracle/apps/ess/financials/commonModules/shared/common/interfaceLoader";
		String jobDefinitionName="InterfaceLoaderController";
		List<String> paramList = new ArrayList<String>();
		paramList.add("15");
		paramList.add(documentId);
		essJobStatusId = erpService.submitESSJobRequest(jobPackageName, jobDefinitionName, paramList);
		return essJobStatusId;
	}
	
	public String getESSJobStatus(long essJobSubmitId) 
			throws cloud.data.integration.common.erpintegrationservice.webservice.ServiceException {
	
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		String essJobStatus = erpService.getESSJobStatus(essJobSubmitId); 
		logger.debug("ESSJobStatus: " + essJobStatus);
		return essJobStatus;
	}
	
	public long submitESSJobRequestForJournalImport(String inboundFileName) throws IOException {
		
		long essJobStatusId = 0;
		
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		String jobPackageName="/oracle/apps/ess/financials/generalLedger/programs/common/";
		String jobDefinitionName="JournalImportLauncher";
		
		Map<String, String> ledgerInfo = new HashMap<String, String>();
		ledgerInfo.put("ledgerName", JournalUtil.getPropertyValue("FUSION_JOURNAL_PARAMETER_VALUE_P_LEDGER_NAME"));
		ledgerInfo.put("county", JournalUtil.getPropertyValue("FUSION_JOURNAL_PARAMETER_VALUE_COUNTY"));
		String journalLedgerId = getBIReportJournalLedgerId(ledgerInfo);
		logger.debug("journalLedgerId when calling import journal "+journalLedgerId);
		
		List<String> paramList = new ArrayList<String>();

		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM1"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM2"));
		paramList.add(journalLedgerId);
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM4"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM5"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM6"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM7"));
		
		try {
			essJobStatusId = erpService.submitESSJobRequest(jobPackageName, jobDefinitionName, paramList);
		} catch (cloud.data.integration.common.erpintegrationservice.webservice.ServiceException e) {
			logger.error("Error"+e.getMessage());
			e.printStackTrace();
		}
		logger.debug("Service Type Name: " + essJobStatusId);
		return essJobStatusId;
	}
	
	public List<DocumentDetails> downloadESSJobExecutionDetails(long essJobSubmitId) 
			throws cloud.data.integration.common.erpintegrationservice.webservice.ServiceException {
	
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		List<DocumentDetails> jobExecutionDetailsList = erpService.downloadESSJobExecutionDetails(String.valueOf(essJobSubmitId), null); 
		logger.debug("Job Execution Details List Size: " + jobExecutionDetailsList.size());
		return jobExecutionDetailsList;
	} 
	
	public String getJobStatus(long requestId) throws InterruptedException, cloud.data.integration.common.erpintegrationservice.webservice.ServiceException {
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		logger.debug("wsdl used "+JournalUtil.getPropertyValue("ERP_INTEGRATION_SERVICE_URL_WSDL"));
		String status = "";
			try {
				Thread.sleep(60000);
				status = erpService.getESSJobStatus(requestId);
			} catch (InterruptedException e1) {
				logger.error("Error"+e1.getMessage());
				e1.printStackTrace();
				throw e1;
			} catch (cloud.data.integration.common.erpintegrationservice.webservice.ServiceException e) {
				logger.error("Error"+e.getMessage());
				e.printStackTrace();
				throw e;
			} catch(Exception excep) 
			{
				logger.error("Error"+excep.getMessage());
				throw excep;
			}			

		while ((status.equals("RUNNING")) || (status.equals("WAIT"))
				|| (status.equals("READY")) || (status.equals("PAUSED"))
				|| (status.equals("BLOCKED")) || (status.equals("COMPLETED"))) {
			try {
				//Thread.sleep(10000);
				Thread.sleep(30000);
				status = erpService.getESSJobStatus(requestId);
				
			} catch (InterruptedException e) {
				logger.error("Error"+e.getMessage());
				e.printStackTrace();
			} catch (cloud.data.integration.common.erpintegrationservice.webservice.ServiceException e) {
				logger.error("Error"+e.getMessage());
				e.printStackTrace();
			} 
			logger.debug("Waiting for ESS Job Status: " + status);
		}
		return status;
	}
	
	public String getBIReportJournalLedgerId(Map ledgerInfo) throws IOException {
		
		ReportDefinition reportDefinition = null;
		String reportAbsolutePath = JournalUtil.getPropertyValue("JOURNAL_FUSION_BI_PUBLISHER_LEDGER_REPORT_PATH");
		ReportService reportService = FusionCloudDataIntegrationService.getBIPublisherReportService();
		ReportRequest reportRequest = new ReportRequest();
		reportRequest.setReportAbsolutePath(reportAbsolutePath);
		ReportResponse reportResponse = null;
		String journalLedgerId = null;
	
	/*	
			try {
				reportDefinition = reportService.getReportDefinition(reportAbsolutePath, 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
				ParamNameValues paramNameValues = reportService.getReportParameters(reportRequest, 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				logger.debug("Param Name: " + paramNameValues.getListOfParamNameValues().getItem().get(0).getName());
				
				byte [] data = reportService.getReportSampleData(reportAbsolutePath, 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
				Path path = FileSystems.getDefault().getPath("/FusionCloudDataIntegration/FileSystem/Journal/Report", "FusionBISampleData.xml");
				Files.write(path, data, StandardOpenOption.CREATE);
				
			} catch (AccessDeniedException_Exception | InvalidParametersException_Exception
					| OperationFailedException_Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	*/		
			ParamNameValues paramNameValues = new ParamNameValues();
			ArrayOfParamNameValue arrayOfParamNameValue = paramNameValues.getListOfParamNameValues();
			if(arrayOfParamNameValue == null) {
				arrayOfParamNameValue = new ArrayOfParamNameValue();
			}
			List<ParamNameValue> paramNameValueList = arrayOfParamNameValue.getItem();
			ParamNameValue paramNameValue = new ParamNameValue();
			paramNameValue.setName((String)ledgerInfo.get("ledgerName"));
			paramNameValue.setLabel("Ledger Name");
			ArrayOfString data = new ArrayOfString();
			data.getItem().add((String)ledgerInfo.get("county"));
			paramNameValue.setValues(data);
			paramNameValueList.add(paramNameValue);
			paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);
			reportRequest.setParameterNameValues(paramNameValues);
			try {
				reportRequest.setAttributeFormat("xml");
				reportRequest.setAttributeLocale("en_US");
				reportRequest.setFlattenXML(false);
				reportRequest.setByPassCache(false);
				reportRequest.setSizeOfDataChunkDownload(-1);
				logger.debug("Before making a call");
				reportResponse = reportService.runReport(reportRequest, 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
				byte [] reportData = reportResponse.getReportBytes();
				logger.debug("Response file writing into file");
			/*	Path path = FileSystems.getDefault().getPath(
						JournalUtil.getPropertyValue("JOURNAL_REPORT_LEDGER_DIRECTORY_PATH_NAME"), 
						JournalUtil.getPropertyValue("JOURNAL_REPORT_LEDGER_FILE_NAME"));
				//Files.createDirectories
				File file = new File(JournalUtil.getPropertyValue("JOURNAL_REPORT_LEDGER_DIRECTORY_PATH_NAME"));
				file.mkdirs();
				Files.write(path, reportData, StandardOpenOption.CREATE);*/
				logger.debug("written into file");
				ByteArrayInputStream input = new ByteArrayInputStream(reportData);
			    JAXBContext jaxbContext = JAXBContext.newInstance(
			    		cloud.data.integration.module.journal.report.jaxb.ledger.ObjectFactory.class);
			    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();			    
			    Object object = unmarshaller.unmarshal(input);
			    DATADS datads = (DATADS)object;
			    journalLedgerId = String.valueOf(datads.getG1().getLEDGERID());
			    logger.debug("The Ledger Id retrieved from Oracle Fusion is: " + datads.getG1().getLEDGERID());
			    			   
			} catch (AccessDeniedException_Exception | InvalidParametersException_Exception
					| OperationFailedException_Exception e) {
				logger.error("Error"+e.getMessage());
				e.printStackTrace();
			} catch (JAXBException e) {
				logger.error("Error"+e.getMessage());
				e.printStackTrace();
			}
			
		return journalLedgerId;
	}
	
	public List<GENERALLEDGERJOURNALCATEGORY> getBIReportJournalCategory(Map categoryInfo) throws Exception {
		logger.debug("Entering getBIReportJournalCategory");
		ReportDefinition reportDefinition = null;
		String reportAbsolutePath = JournalUtil.getPropertyValue("JOURNAL_FUSION_BI_PUBLISHER_CATEGORY_REPORT_PATH");
		ReportService reportService = FusionCloudDataIntegrationService.getBIPublisherReportService();
		ReportRequest reportRequest = new ReportRequest();
		reportRequest.setReportAbsolutePath(reportAbsolutePath);
		ReportResponse reportResponse = null;
		List<GENERALLEDGERJOURNALCATEGORY> reportDataList = null;
		
		/*
		byte[] reportData;
		try {
			reportData = reportService.getReportSampleData(reportAbsolutePath, 
					JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
					JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
			Path path = FileSystems.getDefault().getPath(JournalUtil.getPropertyValue(
				"JOURNAL_REPORT_JOURNAL_CATEGORY_DIRECTORY_PATH_NAME"), 
				JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_CATEGORY_FILE_NAME"));
		
			Files.write(path, reportData, StandardOpenOption.CREATE);
		
		} catch (AccessDeniedException_Exception | InvalidParametersException_Exception
				| OperationFailedException_Exception | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		*/
		
			ParamNameValues paramNameValues = new ParamNameValues();
			ArrayOfParamNameValue arrayOfParamNameValue = paramNameValues.getListOfParamNameValues();
			if(arrayOfParamNameValue == null) {
				arrayOfParamNameValue = new ArrayOfParamNameValue();
			}
			List<ParamNameValue> paramNameValueList = arrayOfParamNameValue.getItem();
			ParamNameValue paramNameValue = new ParamNameValue();
			paramNameValue.setName((String)categoryInfo.get("journalCategoryName"));
			//paramNameValue.setLabel("Category Name");
			ArrayOfString arrayOfValue = new ArrayOfString();
			arrayOfValue.getItem().add("");
			paramNameValue.setValues(arrayOfValue);
			paramNameValueList.add(paramNameValue);
			paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);
			reportRequest.setParameterNameValues(paramNameValues);
			try {
				reportRequest.setAttributeFormat("xml");
				reportRequest.setAttributeLocale("en_US");
				reportRequest.setFlattenXML(false);
				reportRequest.setByPassCache(false);
				reportRequest.setSizeOfDataChunkDownload(-1);
				reportResponse = reportService.runReport(reportRequest, 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
				byte [] data = reportResponse.getReportBytes();
				/*Path reportPath = FileSystems.getDefault().getPath(
						JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_CATEGORY_DIRECTORY_PATH_NAME"), 
						JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_CATEGORY_FILE_NAME"));
				//Files.createDirectories
				File file = new File(JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_CATEGORY_DIRECTORY_PATH_NAME"));
				file.mkdirs();
				Files.write(reportPath, data, StandardOpenOption.CREATE);
			    logger.debug("data" +data);*/
			    JAXBContext jaxbContext = JAXBContext.newInstance(
			    		cloud.data.integration.module.journal.report.jaxb.journalCategory.ObjectFactory.class);
			    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			    ByteArrayInputStream input = new ByteArrayInputStream(data);
			    Object object = unmarshaller.unmarshal(input);
			    cloud.data.integration.module.journal.report.jaxb.journalCategory.JOURNALCATEGORYDATA datads = 
			    		(cloud.data.integration.module.journal.report.jaxb.journalCategory.JOURNALCATEGORYDATA)object;
			    reportDataList = datads.getGENERALLEDGERJOURNALCATEGORY();
			    logger.debug("End getBIReportJournalCategory");
			   // journalLedgerId = String.valueOf(datads.getG1().getLEDGERID());
			    //logger.debug("The Journal Category retrieved from Oracle Fusion is: " + datads.getG1().getLEDGERID());
			    			   
			} catch (AccessDeniedException_Exception | InvalidParametersException_Exception
					| OperationFailedException_Exception e) {
				logger.error("Error getBIReportJournalCategory"+e.getMessage());
				e.printStackTrace();
				throw e;
			} catch (JAXBException e) {
				logger.error("Error getBIReportJournalCategory"+e.getMessage());
				e.printStackTrace();
				throw e;
			}
			
		return reportDataList;
	}
	
public List<GENERALLEDGERJOURNALSOURCE> getBIReportJournalSource(Map categoryInfo) throws Exception {
		
		ReportDefinition reportDefinition = null;
		String reportAbsolutePath = JournalUtil.getPropertyValue("JOURNAL_FUSION_BI_PUBLISHER_SOURCE_REPORT_PATH");
		ReportService reportService = FusionCloudDataIntegrationService.getBIPublisherReportService();
		ReportRequest reportRequest = new ReportRequest();
		reportRequest.setReportAbsolutePath(reportAbsolutePath);
		ReportResponse reportResponse = null;
		List<GENERALLEDGERJOURNALSOURCE> reportDataList = null;
		
		/* 
		byte[] reportData;
		try {
			reportData = reportService.getReportSampleData(reportAbsolutePath, 
					JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
					JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
			Path path = FileSystems.getDefault().getPath(JournalUtil.getPropertyValue(
				"JOURNAL_REPORT_JOURNAL_SOURCE_DIRECTORY_PATH_NAME"), 
				JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_SOURCE_FILE_NAME"));
		
			Files.write(path, reportData, StandardOpenOption.CREATE);
		
		} catch (AccessDeniedException_Exception | InvalidParametersException_Exception
				| OperationFailedException_Exception | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		 
		*/
		    
		
			ParamNameValues paramNameValues = new ParamNameValues();
			ArrayOfParamNameValue arrayOfParamNameValue = paramNameValues.getListOfParamNameValues();
			if(arrayOfParamNameValue == null) {
				arrayOfParamNameValue = new ArrayOfParamNameValue();
			}
			List<ParamNameValue> paramNameValueList = arrayOfParamNameValue.getItem();
			ParamNameValue paramNameValue = new ParamNameValue();
			paramNameValue.setName((String)categoryInfo.get("journalSourceName"));
			//paramNameValue.setLabel("Category Name");
			ArrayOfString arrayOfValue = new ArrayOfString();
			arrayOfValue.getItem().add("");
			paramNameValue.setValues(arrayOfValue);
			paramNameValueList.add(paramNameValue);
			paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);
			reportRequest.setParameterNameValues(paramNameValues);
			try {
				reportRequest.setAttributeFormat("xml");
				reportRequest.setAttributeLocale("en_US");
				reportRequest.setFlattenXML(false);
				reportRequest.setByPassCache(false);
				
				reportRequest.setSizeOfDataChunkDownload(-1);
				//logger.debug("reportRequest"+reportRequest);
				reportResponse = reportService.runReport(reportRequest, 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"), 
						JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_PASSWORD"));
				
				byte [] data = reportResponse.getReportBytes();
				//logger.debug("data in bytes"+data.length);
				//logger.debug("data in bytes"+data.toString());
				
				Path reportPath = FileSystems.getDefault().getPath(
						JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_SOURCE_DIRECTORY_PATH_NAME"), 
						JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_SOURCE_FILE_NAME"));
				//Files.createDirectories
				File file = new File(JournalUtil.getPropertyValue("JOURNAL_REPORT_JOURNAL_SOURCE_DIRECTORY_PATH_NAME"));
				file.mkdirs();
				Files.write(reportPath, data, StandardOpenOption.CREATE); 
			
			    JAXBContext jaxbContext = JAXBContext.newInstance(
			    		cloud.data.integration.module.journal.report.jaxb.journalSource.ObjectFactory.class);
			    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			    ByteArrayInputStream input = new ByteArrayInputStream(data);
			    Object object = unmarshaller.unmarshal(input);
			    			    		    
			    cloud.data.integration.module.journal.report.jaxb.journalSource.JOURNALSOURCEDATA datads = 
			     		(cloud.data.integration.module.journal.report.jaxb.journalSource.JOURNALSOURCEDATA)object;
			    reportDataList = datads.getGENERALLEDGERJOURNALSOURCE();
			    
			   // journalLedgerId = String.valueOf(datads.getG1().getLEDGERID());
			    //logger.debug("The Journal Category retrieved from Oracle Fusion is: " + datads.getG1().getLEDGERID());
			    			   
			} catch (AccessDeniedException_Exception | InvalidParametersException_Exception
					| OperationFailedException_Exception e) {
				e.printStackTrace();
				logger.error("Error"+e.getMessage());
				throw e;
			} catch (JAXBException e) {
				logger.error("Error"+e.getMessage());
				e.printStackTrace();
				throw e;
			}
			
		return reportDataList;
	}
	

	
	public boolean processJournalCSVFileWithColumnMapping(String sourceFilePath, String inboundFileName) throws Exception {
    	
		boolean validRecord=false;
    	//File sourceCSVFile = new File(CommonMethods.getPropertyValue("SOURCE_FILE_PATH"));
		File sourceCSVFile = new File(sourceFilePath);
    	//File [] sourceFilesList = sourceCSVFile.listFiles();
    	if(sourceCSVFile == null) {
    		logger.debug("Journal Source File Path Does Not Exist.");
    		throw new JournalImportException("Journal Source File Path does not exist.");
    	}else {   
    		
    		Map<String, String> ledgerInfo = new HashMap<String, String>();
    		ledgerInfo.put("ledgerName", JournalUtil.getPropertyValue("FUSION_JOURNAL_PARAMETER_VALUE_P_LEDGER_NAME"));
    		ledgerInfo.put("county", JournalUtil.getPropertyValue("FUSION_JOURNAL_PARAMETER_VALUE_COUNTY"));
    		String journalLedgerId = getBIReportJournalLedgerId(ledgerInfo);
    		logger.debug("JournalLedgerId: " + journalLedgerId);
    	
    		Map<String, String> journalSourceInfo = new HashMap<String, String>();
    		journalSourceInfo.put("journalSourceName", 
    				JournalUtil.getPropertyValue("FUSION_JOURNAL_PARAMETER_VALUE_SOURCE_NAME"));
    		List<GENERALLEDGERJOURNALSOURCE> journalSourceReportDataList = getBIReportJournalSource(journalSourceInfo);
    		FileReader fileRead=null;
    		CSVReader reader=null;
    		CSVWriter csvWrite=null;
    		FileWriter fileWrite=null;
    		boolean errorFound = false;
    		List<JournalCSVColumnMapping> errorDataList =null;
            try
            {
    		//Thread.sleep(60000);
    		logger.debug("Calling general category");
    		Map<String, String> journalCategoryInfo = new HashMap<String, String>();
    		journalCategoryInfo.put("journalCategoryName", 
    				JournalUtil.getPropertyValue("FUSION_JOURNAL_PARAMETER_VALUE_CATEGORY_NAME"));
    		List<GENERALLEDGERJOURNALCATEGORY> journalCategoryReportDataList = getBIReportJournalCategory(journalCategoryInfo);
    		logger.debug("End calling general category");	
	    	//for(File sourceFile : sourceFilesList) {
    		    fileRead=new FileReader(sourceCSVFile);
		    	reader = new CSVReader(fileRead);
		    	CsvToBean<JournalCSVColumnMapping> csvToBean = new CsvToBean<JournalCSVColumnMapping>();
		
		    	Map<String, String> columnMapping = new HashMap<String, String>();
		    	columnMapping.put("*Status Code", "statusCode");
		    	columnMapping.put("*Ledger ID", "ledgerId");
		    	columnMapping.put("*Effective Date of Transaction", "effectiveDateOfTransaction");
		    	columnMapping.put("*Journal Source", "journalSource");
		    	columnMapping.put("*Journal Category","journalCategory");
		    	columnMapping.put("*Currency Code","currencyCode");
		    	columnMapping.put("*Journal Entry Creation Date","journalEntryCreationDate");
		    	columnMapping.put("*Actual Flag","actualFlag");
		    	//========
		    	columnMapping.put("Segment1","segment1");
		    	columnMapping.put("Segment2","segment2");
		    	columnMapping.put("Segment3","segment3");
		    	columnMapping.put("Segment4","segment4");
		    	columnMapping.put("Segment5","segment5");
		    	columnMapping.put("Segment6","segment6");
		    	columnMapping.put("Segment7","segment7");
		    	columnMapping.put("Segment8","segment8");
		    	columnMapping.put("Segment9","segment9");
		    	columnMapping.put("Segment10","segment10");
		    	columnMapping.put("Segment11","segment11");
		    	columnMapping.put("Segment12","segment12");
		    	columnMapping.put("Segment13","segment13");
		    	columnMapping.put("Segment14","segment14");
		    	columnMapping.put("Segment15","segment15");
		    	columnMapping.put("Segment16","segment16");
		    	columnMapping.put("Segment17","segment17");
		    	columnMapping.put("Segment18","segment18");
		    	columnMapping.put("Segment19","segment19");
		    	columnMapping.put("Segment20","segment20");
		    	columnMapping.put("Segment21","segment21");
		    	columnMapping.put("Segment22","segment22");
		    	columnMapping.put("Segment23","segment23");
		    	columnMapping.put("Segment24","segment24");
		    	columnMapping.put("Segment25","segment25");
		    	columnMapping.put("Segment26","segment26");
		    	columnMapping.put("Segment27","segment27");
		    	columnMapping.put("Segment28","segment28");
		    	columnMapping.put("Segment29","segment29");
		    	columnMapping.put("Segment30","segment30");
		    	//===================
		    	columnMapping.put("Entered Debit Amount","enteredDebitAmount");
		    	columnMapping.put("Entered Credit Amount","enteredCreditAmount");
		    	columnMapping.put("Converted Debit Amount","convertedDebitAmount");
		    	columnMapping.put("Converted Credit Amount","convertedCreditAmount");
		    	//===================
		    	columnMapping.put("REFERENCE1 (Batch Name)","reference1BatchName"); 
		    	columnMapping.put("REFERENCE2 (Batch Description)","reference2BatchDescription");
		    	//TODO:====StartIssues
		    	//Reference3 is hidden
		  //  	columnMapping.put("REFERENCE3","reference3");
		    	columnMapping.put("REFERENCE4 (Journal Entry Name)","reference4JournalEntryName");
		    	//TODO:====End Issues
		    	columnMapping.put("REFERENCE5 (Journal Entry Description)","reference5JournalEntryDescription");
		    	columnMapping.put("REFERENCE6 (Journal Entry Reference)","reference6JournalEntryReference");
		    	columnMapping.put("REFERENCE7 (Journal Entry Reversal flag)","reference7JournalEntryReversalFlag");
		    	columnMapping.put("REFERENCE8 (Journal Entry Reversal Period)","reference8JournalEntryReversalPeriod");
		    	columnMapping.put("REFERENCE9 (Journal Reversal Method)","reference9JournalReversalMethod");
		    	columnMapping.put("REFERENCE10 (Journal Entry Line Description)","reference10JournalEntryLineDescription");
		    	//=========Start of New columns added
		    /*	
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    	columnMapping.put("Reference column 1", "referenceColumn1");
		    */	
		    	//=========End of New columns added
		    	columnMapping.put("Statistical Amount","statisticalAmount");
		    	columnMapping.put("Currency Conversion Type","currencyConversionType");
		    	columnMapping.put("Currency Conversion Date","currencyConversionDate");
		    	columnMapping.put("Currency Conversion Rate","currencyConversionRate");
		    	columnMapping.put("Interface Group Identifier","interfaceGroupIdentifier");
		    	columnMapping.put("Context field for Journal Entry Line DFF","contextFieldForJournalEntryLineDFF");
		    	columnMapping.put("ATTRIBUTE1 Value for Journal Entry Line DFF","attribute1ValueForJournalEntryLineDFF");
		    	columnMapping.put("ATTRIBUTE2 Value for Journal Entry Line DFF","attribute2ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute3 Value for Journal Entry Line DFF","attribute3ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute4 Value for Journal Entry Line DFF","attribute4ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute5 Value for Journal Entry Line DFF","attribute5ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute6 Value for Journal Entry Line DFF","attribute6ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute7 Value for Journal Entry Line DFF","attribute7ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute8 Value for Journal Entry Line DFF","attribute8ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute9 Value for Journal Entry Line DFF","attribute9ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute10 Value for Journal Entry Line DFF","attribute10ValueForJournalEntryLineDFF");
		    	columnMapping.put("Attribute11 Value for Captured Information DFF","attribute11ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute12 Value for Captured Information DFF","attribute12ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute13 Value for Captured Information DFF","attribute13ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute14 Value for Captured Information DFF","attribute14ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute15 Value for Captured Information DFF","attribute15ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute16 Value for Captured Information DFF","attribute16ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute17 Value for Captured Information DFF","attribute17ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute18 Value for Captured Information DFF","attribute18ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute19 Value for Captured Information DFF","attribute19ValueForCapturedInformationDFF");
		    	columnMapping.put("Attribute20 Value for Captured Information DFF","attribute20ValueForCapturedInformationDFF");
		    	columnMapping.put("Context field for Captured Information DFF","contextFieldForCapturedInformationDFF");
		    	//columnMapping.put("Average Journal Flag","averageJournalFlag");
		    	columnMapping.put("Clearing Company","clearingCompany");
		    	columnMapping.put("Ledger Name","ledgerName");
		    	columnMapping.put("Encumbrance Type ID","encumbranceTypeID");
		    	columnMapping.put("Additional Information","additionalInformation");
		 		
		    	HeaderColumnNameTranslateMappingStrategy<JournalCSVColumnMapping> strategy = new HeaderColumnNameTranslateMappingStrategy<JournalCSVColumnMapping>();
		    	strategy.setType(JournalCSVColumnMapping.class);
		    	strategy.setColumnMapping(columnMapping);
		
		    	List<JournalCSVColumnMapping> list = null;
		    	
		    	list = csvToBean.parse(strategy, reader);
		    	
		    	fileRead.close();
    		    reader.close();
    		       
		        //String csvFileName = CommonMethods.getPropertyValue("INBOUND_CSV_COLUMN_MAPPED_FILE_NAME");
		    	String csvFileName = inboundFileName;
		    	fileWrite=new FileWriter(csvFileName);
		        csvWrite = new CSVWriter(new FileWriter(csvFileName));  
		        List<String[]> data = new ArrayList<String[]>();  
		        errorDataList = new ArrayList<JournalCSVColumnMapping>();
		        
		        //TODO:  If you want to add headers to the file, then uncomment the following line and add the 
		        //remaining headers in the array.
		/*        
		        data.add(new String[] {"Status Code","Ledger Id","Effective Date Of Transaction", "Journal Source",
		        		"Journal Category", "Currency Code", "Journal Entry Creation Date",
		        		"Actual Flag", "Segment1","Segment2", "Segment3", "Segment4", "Segment5", "Segment6",
		        		"Segment7", "Segment8", "Segment9", "Segment10", "Segment11",
		        		"Segment12", "Segment13", "Segment14", "Segment15", "Segment16",  "Segment17", 
		        		"Segment18", "Segment19", "Segment20", "Segment21", "Segment22","Segment23",
		        		"Segment24", "Segment25","Segment26","Segment27","Segment28","Segment29","Segment30", "Entered Debit Amount", 
		        		"Entered Credit Amount", "Converted Debit Amount", "Converted Credit Amount", "REFERENCE1 (Batch Name)", 
		        		"REFERENCE2 (Batch Description)", "REFERENCE4 (Journal Entry Name)", "REFERENCE5 (Journal Entry Description)", 
		        		"REFERENCE6 (Journal Entry Reference)", "REFERENCE7 (Journal Entry Reversal flag)", 
		        		"REFERENCE8 (Journal Entry Reversal Period)", "REFERENCE9 (Journal Reversal Method)", 
		        		"REFERENCE10 (Journal Entry Line Description)", "Statistical Amount", "Currency Conversion Type", 
		        		"Currency Conversion Date", "Currency Conversion Rate", "Interface Group Identifier", "Context field for Journal Entry Line DFF",
		        		"ATTRIBUTE1 Value for Journal Entry Line DFF", "ATTRIBUTE2 Value for Journal Entry Line DFF", 
		        		"Attribute3 Value for Journal Entry Line DFF", 
		        		"Attribute4 Value for Journal Entry Line DFF", "Attribute5 Value for Journal Entry Line DFF", "Attribute6 Value for Journal Entry Line DFF", 
		        		"Attribute7 Value for Journal Entry Line DFF", "Attribute8 Value for Journal Entry Line DFF", "Attribute9 Value for Journal Entry Line DFF", 
		        		"Attribute10 Value for Journal Entry Line DFF", "Attribute11 Value for Captured Information DFF", "Attribute12 Value for Captured Information DFF", 
		        		"Attribute13 Value for Captured Information DFF", "Attribute14 Value for Captured Information DFF", "Attribute15 Value for Captured Information DFF", 
		        		"Attribute16 Value for Captured Information DFF", "Attribute17 Value for Captured Information DFF", "Attribute18 Value for Captured Information DFF", 
		        		"Attribute19 Value for Captured Information DFF", "Attribute20 Value for Captured Information DFF", "Context field for Captured Information DFF",
		        		"Average Journal Flag", "Clearing Company", "Ledger Name", "Encumbrance Type ID", "Additional Information"});
		  */   
		        for(JournalCSVColumnMapping dataColumn : list) {
		        	String StatusCode= dataColumn.getStatusCode();
		        	//String ledgerId = journalLedgerId;
		        	String ledgerId = dataColumn.getLedgerId() != null ? dataColumn.getLedgerId().trim() : "";
		        	String journalSource = dataColumn.getJournalSource() != null ? dataColumn.getJournalSource().trim() : "";
		        	String journalCategory = dataColumn.getJournalCategory() != null ? dataColumn.getJournalCategory().trim() : "";
		        	
		        	
		        	try{
		        		if(ledgerId == null || ledgerId.trim().length() == 0) {
			        		 //csvWriter.close();
		        			logger.debug("ledgerId from CSV file is null, may be header is missing");
		        			throw new JournalImportException("An error occurred while processing the customer data file. " +
				        		 "The data file contains No or Invalid General Ledger LedgerId Information.");
			        	}else if(!ledgerId.trim().equalsIgnoreCase(journalLedgerId)) {
			        		// keeping whatever is coming from fusion
			        		logger.debug("Existing ledger Id in CSV file ["+ledgerId+"]");
			        		logger.debug("ledger Id in fusion ["+journalLedgerId+"]");
			        		ledgerId=journalLedgerId;
		        		}
		        	}catch(JournalImportException e) {
		        		errorFound = true;
		        		logger.error(e.getMessage());
		        		
		        	}
		        	
		        	if(!errorFound) {
		        	try {
			        	boolean foundJournalSource = false;
			        	for(GENERALLEDGERJOURNALSOURCE source : journalSourceReportDataList) {
			        		if(journalSource.equalsIgnoreCase(source.getUSERJESOURCENAME())) {
			    				foundJournalSource = true;
			    				break;
				        	} 	
			    		}
			        	
			        	if(!foundJournalSource) {	
			        		 //csvWriter.close();
			        		logger.error("\"An error occurred while processing the customer data file. \" +\r\n" + 
			        				"			        		 \"The data file contains No or Invalid General Ledger Journal Source Information.\"");
			        		throw new JournalImportException("An error occurred while processing the customer data file. " +
			        		 "The data file contains No or Invalid General Ledger Journal Source Information.");	
			        	}
		        	}catch(JournalImportException e) {
		        		logger.error(e.getMessage());
		        		
		        		errorFound = true;
		        		System.err.println(e.getMessage());
		        		
		        	}
		        	}
		        	if(!errorFound) {
		        	try {
			        	boolean foundJournalCategory = false;
			        	for(GENERALLEDGERJOURNALCATEGORY category : journalCategoryReportDataList) {
			        	//	logger.debug("General Ledger Journal Category Info: " + category.getUSERJECATEGORYNAME());
			        		if(journalCategory.equalsIgnoreCase(category.getUSERJECATEGORYNAME())) {
			        			foundJournalCategory = true;
			        			break;
			        		}
			        	}
			        	
			        	if(!foundJournalCategory) {
			        		//csvWriter.close();
			        		throw new JournalImportException("An error occurred while processing the customer data file. " +
			        		"The data file contains No or Invalid General Ledger Journal Category Information.");
			        	}
		        	}catch(JournalImportException e) {
		        		errorFound = true;
		        		//System.err.println(e.getMessage());
		        		logger.error("Error"+e.getMessage());
		        		logger.error("closed all opend streams");
		        	}
		        	}
		        	if(errorFound) {
		        		errorDataList.add(dataColumn);
		        	}
		        	
		        	
		        	if(!errorFound) {
		        		validRecord=true;
			        	data.add(new String[] {dataColumn.getStatusCode(),ledgerId,dataColumn.getEffectiveDateOfTransaction(),
			        			dataColumn.getJournalSource(), dataColumn.getJournalCategory(), dataColumn.getCurrencyCode(),
			        			dataColumn.getJournalEntryCreationDate(), dataColumn.getActualFlag(), dataColumn.getSegment1(),
			        			dataColumn.getSegment2(), dataColumn.getSegment3(), dataColumn.getSegment4(), dataColumn.getSegment5(),
			        			dataColumn.getSegment6(), dataColumn.getSegment7(), dataColumn.getSegment8(), dataColumn.getSegment9(), 
			        			dataColumn.getSegment10(), dataColumn.getSegment11(), dataColumn.getSegment12(), dataColumn.getSegment13(), 
			        			dataColumn.getSegment14(), dataColumn.getSegment15(), dataColumn.getSegment16(), dataColumn.getSegment17(), 
			        			dataColumn.getSegment18(), dataColumn.getSegment19(), dataColumn.getSegment20(), dataColumn.getSegment21(), 
			        			dataColumn.getSegment22(), dataColumn.getSegment23(), dataColumn.getSegment24(), dataColumn.getSegment25(), 
			        			dataColumn.getSegment26(), dataColumn.getSegment27(), dataColumn.getSegment28(), dataColumn.getSegment29(), 
			        			dataColumn.getSegment30(), dataColumn.getEnteredDebitAmount(), dataColumn.getEnteredCreditAmount(),
			        			dataColumn.getConvertedDebitAmount(), dataColumn.getConvertedCreditAmount(), dataColumn.getReference1BatchName(),
			        			dataColumn.getReference2BatchDescription(), dataColumn.getReference4JournalEntryName(),
			        			dataColumn.getReference5JournalEntryDescription(), dataColumn.getReference6JournalEntryReference(),
			        			dataColumn.getReference7JournalEntryReversalFlag(), dataColumn.getReference8JournalEntryReversalPeriod(),
			        			dataColumn.getReference9JournalReversalMethod(), dataColumn.getReference10JournalEntryLineDescription(),
			        			dataColumn.getStatisticalAmount(), dataColumn.getCurrencyConversionType(), dataColumn.getCurrencyConversionDate(),
			        			dataColumn.getCurrencyConversionRate(),
			        			dataColumn.getInterfaceGroupIdentifier(), dataColumn.getContextFieldForJournalEntryLineDFF(),
			        			dataColumn.getAttribute1ValueForJournalEntryLineDFF(), dataColumn.getAttribute2ValueForJournalEntryLineDFF(),
			        			dataColumn.getAttribute3ValueForJournalEntryLineDFF(), dataColumn.getAttribute4ValueForJournalEntryLineDFF(),
			        			dataColumn.getAttribute5ValueForJournalEntryLineDFF(), dataColumn.getAttribute6ValueForJournalEntryLineDFF(),
			        			dataColumn.getAttribute7ValueForJournalEntryLineDFF(), dataColumn.getAttribute8ValueForJournalEntryLineDFF(),
			        			dataColumn.getAttribute9ValueForJournalEntryLineDFF(), dataColumn.getAttribute10ValueForJournalEntryLineDFF(),
			        			dataColumn.getAttribute11ValueForCapturedInformationDFF(), dataColumn.getAttribute12ValueForCapturedInformationDFF(),
			        			dataColumn.getAttribute13ValueForCapturedInformationDFF(), dataColumn.getAttribute14ValueForCapturedInformationDFF(),
			        			dataColumn.getAttribute15ValueForCapturedInformationDFF(), dataColumn.getAttribute16ValueForCapturedInformationDFF(),
			        			dataColumn.getAttribute17ValueForCapturedInformationDFF(), dataColumn.getAttribute18ValueForCapturedInformationDFF(),
			        			dataColumn.getAttribute19ValueForCapturedInformationDFF(), dataColumn.getAttribute20ValueForCapturedInformationDFF(),
			        			dataColumn.getContextFieldForCapturedInformationDFF(), dataColumn.getClearingCompany(), dataColumn.getLedgerName(),
			        			dataColumn.getEncumbranceTypeID(), dataColumn.getAdditionalInformation()
			        			});
			        	  	
		        	}
		        }
		        csvWrite.writeAll(data);
		        fileWrite.close();
		        csvWrite.close();
		      
		      
		        
        	
		        if(errorFound){	
			        StringBuffer message = new StringBuffer();
			        message.append("\n\nTotal Number of records in the CSV file: " + list.size());
			        message.append("\n\nThe following record(s) failed due to invalid data.\n\n");
			        for(JournalCSVColumnMapping errorData : errorDataList) {
	        			message.append("Status Code: " + errorData.getStatusCode() + ", LedgerId:" + errorData.getLedgerId() + "," + errorData.getEffectiveDateOfTransaction());
	        		}
			        message.append("\n\nTotal of " + errorDataList.size() + " record(s) failed.");
			        
			        
			        MailManager.sendMail(JournalUtil.getPropertyValue("MAIL_USER_FROM_ADDRESS"), 
			        		JournalUtil.getPropertyValue("MAIL_USER_TO_ADDRESS"), "Customer Data Validation Failed", 
			        		message.toString());
		        }
            }catch(Exception e) {
	            if(fileRead!=null) {
		    	// close the reader.
	            	 fileRead.close();
		    	}
	            if(reader!=null) {
	            	reader.close();
		    	}
	            if(fileWrite!=null) {
		            fileWrite.close();
		            }
	            if(csvWrite!=null) {
	            	csvWrite.close();
	            }
	           logger.error("Error"+e.getMessage()); 
	           logger.error("Closed all streams"); 
	           
       	}
    	}
    	return validRecord;
    }
}
