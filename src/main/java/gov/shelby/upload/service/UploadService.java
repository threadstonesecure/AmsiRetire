package gov.shelby.upload.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;

import cloud.data.integration.common.erpintegrationservice.webservice.DocumentDetails;
import cloud.data.integration.common.erpintegrationservice.webservice.ErpIntegrationService;
import cloud.data.integration.common.erpintegrationservice.webservice.ObjectFactory;
import cloud.data.integration.common.erpintegrationservice.webservice.ServiceException;
import cloud.data.integration.common.service.FusionCloudDataIntegrationService;
import cloud.data.integration.common.util.CommonMethods;
import cloud.data.integration.common.util.MailManager;
import cloud.data.integration.module.journal.util.JournalUtil;

public class UploadService {

final static Logger logger = Logger.getLogger(UploadService.class);
// static ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
	
	public static String uploadFileToFusion(String fileNameLocation,String docAccount, String archiveLocation, String localLogDirectory ) throws 
		cloud.data.integration.common.erpintegrationservice.webservice.ServiceException, 
		IOException {
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		// String essSubmittedJobStatusIL =null;
		String serverReturnedDocId = null;
		
		ObjectFactory objectFactory = new ObjectFactory();
	   
		File uploadSourceFiles = new File(fileNameLocation);
		File[] uploadFilesList = uploadSourceFiles.listFiles();
		if(uploadFilesList.length==0) {
			
			logger.error("Files dosn't exists in source folder. Please keep the files in source folder and try again");
		}
		for (File file : uploadFilesList) {
		logger.debug("Let us upload file: " + file.getAbsolutePath());
		File zipFile = file;
		String fileName=file.getAbsolutePath();
		
		// UploadFileToUcm uploadFile = objectFactory.createUploadFileToUcm();
		DocumentDetails documentDetails = objectFactory.createDocumentDetails();
		
		JAXBElement<String> documentTitle = objectFactory.
				createDocumentDetailDocumentTitle(zipFile.getName());
		documentDetails.setDocumentTitle(documentTitle);
		
		JAXBElement<String> documentAuthor = objectFactory.
				createDocumentDetailDocumentAuthor(JournalUtil.getPropertyValue("FUSION_INTEGRATION_USER_ID"));
		documentDetails.setDocumentAuthor(documentAuthor);
		
		JAXBElement<String> documentId = objectFactory.createDocumentDetailDocumentId("1000");
		documentDetails.setDocumentId(documentId);
		
		String fileNameExt=fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
  		logger.debug("File name extension"+fileNameExt);
		
		JAXBElement<String> documentContentType = objectFactory.createDocumentDetailContentType(fileNameExt);
		documentDetails.setContentType(documentContentType);
		
		JAXBElement<String> documentSecurityGroup = objectFactory.
				createDocumentDetailDocumentSecurityGroup("FAFusionImportExport");
		documentDetails.setDocumentSecurityGroup(documentSecurityGroup);
		
		
		JAXBElement<String> documentAccount = objectFactory.
				createDocumentDetailDocumentAccount(docAccount);
		documentDetails.setDocumentAccount(documentAccount); 
		
		
		documentDetails.setFileName(zipFile.getName());
		
		//File fileToUpload = new File(fileName);
		Path filePath = Paths.get(fileName);

		byte[] documentContent = null;

		documentContent = Files.readAllBytes(filePath);
		if(documentContent!=null) {
			
			logger.debug("documentContent"+ documentContent.length);
		}

		documentDetails.setContent(documentContent);
		serverReturnedDocId = erpService.uploadFileToUcm(documentDetails);

		}
		// logger.debug("Server Returned Document Id: " + serverReturnedDocId);
		return serverReturnedDocId;
	}

	public static long submitESSJobRequest(String serverReturnedDocId) {
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		String jobPackageName="/oracle/apps/ess/financials/commonModules/shared/common/interfaceLoader";
		String jobDefinitionName="InterfaceLoaderController";
		long jobRequestIdIL = 0;
		List<String> paramList = new ArrayList<String>();
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM1"));
		paramList.add(serverReturnedDocId);
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM3"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM4"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_IMPORT_PARAM5"));
		try {
			jobRequestIdIL = erpService.submitESSJobRequest(jobPackageName, jobDefinitionName, paramList);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return jobRequestIdIL;
	}

	public static String getESSJobStatus(long jobRequestId) {
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		String essSubmittedJobStatusIL = null;
		try {
			essSubmittedJobStatusIL = erpService.getESSJobStatus(jobRequestId);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		while ((essSubmittedJobStatusIL.equals("RUNNING")) || (essSubmittedJobStatusIL.equals("WAIT"))
				|| (essSubmittedJobStatusIL.equals("READY")) || (essSubmittedJobStatusIL.equals("PAUSED"))
				|| (essSubmittedJobStatusIL.equals("BLOCKED")) || (essSubmittedJobStatusIL.equals("COMPLETED"))) {
			try {
				Thread.sleep(30000);
				essSubmittedJobStatusIL = erpService.getESSJobStatus(jobRequestId);

			} catch (InterruptedException | ServiceException e) {

				logger.error("Error"+e.getMessage());
				e.printStackTrace();

			} 
			logger.debug("Waiting for ESS Job Status: " + essSubmittedJobStatusIL);
		}

		return essSubmittedJobStatusIL;
	}

	public static void checkStatusAndExecEmail(String essSubmittedJobStatusIL, Long jobRequestId) throws InterruptedException, IOException {

		// String subject = null;
		// String message = null;
		long importRequestId = 0;
		String importEssJobRequest = null;
		String subject = null;
		String message = null;
		String localLogDirectory = JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME","dmi").trim();
		if (essSubmittedJobStatusIL.equalsIgnoreCase("ERROR")) {
			logger.debug(
					"An error has occurred at Oracle Fusion Server while processing the submitted ESSJob");
			subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_SUBJECT_LINE");
			message = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_TEXT_FOR_JOURNAL_IMPORT");
			downLoadExecDetailsAndSendEmail(jobRequestId, essSubmittedJobStatusIL, localLogDirectory, subject, message);
		} else if (essSubmittedJobStatusIL.equalsIgnoreCase("SUCCEEDED")) {
			logger.debug("SUCCEEDED !!! ");
			subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_SUBJECT_LINE");
			message = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_TEXT_FOR_JOURNAL_IMPORT");
			importRequestId = submitESSJobRequestForJournalImport();
			logger.debug("wait for 10 Sec");
			logger.debug("Thread is started sleeping " + new Date());
			Thread.sleep(10000);
			logger.debug("Thread is End sleeping " + new Date());
			logger.debug("Start making a call to getJobStatus request Id "+importRequestId );
			importEssJobRequest = getESSJobStatus(importRequestId);
			logger.debug("End making a call to getJobStatus "+ new Date() );
			logger.debug(" getJobStatus journalImportESSJobStatus [" + importEssJobRequest + "]");
			if(importEssJobRequest.equalsIgnoreCase("SUCCEEDED")) {
				downLoadExecDetailsAndSendEmail(importRequestId,importEssJobRequest,localLogDirectory,subject,message);
			}
			else if (importEssJobRequest.equalsIgnoreCase("ERROR")) {
				logger.debug(
						"An error has occurred at Oracle Fusion Server while processing the submitted ESSJob");
				subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_SUBJECT_LINE");
				message = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_TEXT_FOR_JOURNAL_IMPORT");
				downLoadExecDetailsAndSendEmail(importRequestId,importEssJobRequest,localLogDirectory,subject,message);
			} else if (importEssJobRequest.equalsIgnoreCase("SUCCEEDED")) {
				subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_SUBJECT_LINE");
				message = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_TEXT_FOR_JOURNAL_IMPORT");
				downLoadExecDetailsAndSendEmail(importRequestId,importEssJobRequest,localLogDirectory,subject,message);
			
			} else if (importEssJobRequest.equalsIgnoreCase("WARNING")) {
				subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_SUBJECT_LINE");
				message = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_TEXT_FOR_JOURNAL_IMPORT");
				downLoadExecDetailsAndSendEmail(importRequestId,importEssJobRequest,localLogDirectory,subject,message);
			} else if (importEssJobRequest.equalsIgnoreCase("RUNNING")) {
				subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_SUBJECT_LINE");
				message = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_TEXT_FOR_JOURNAL_IMPORT");
				downLoadExecDetailsAndSendEmail(importRequestId,importEssJobRequest,localLogDirectory,subject,message);
			}
			
		} else if (essSubmittedJobStatusIL.equalsIgnoreCase("WARNING")) {
			logger.debug("Warning State");
			subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_SUBJECT_LINE");
			message = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_TEXT_FOR_JOURNAL_IMPORT");
			downLoadExecDetailsAndSendEmail(jobRequestId, essSubmittedJobStatusIL, localLogDirectory, subject, message);
		} else if (essSubmittedJobStatusIL.equalsIgnoreCase("RUNNING")) {
			logger.debug("Still in running State");
			subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_SUBJECT_LINE");
			message = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_TEXT_FOR_JOURNAL_IMPORT");
			downLoadExecDetailsAndSendEmail(jobRequestId, essSubmittedJobStatusIL, localLogDirectory, subject, message);
		}

	}

	private static long submitESSJobRequestForJournalImport() {
		
		long essJobStatusId =0;
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		String jobPackageName="oracle/apps/ess/financials/assets/additions";
		String jobDefinitionName="PostMassAdditions";
		
		List<String> paramList = new ArrayList<String>();
		
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM1"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM2"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM3"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM4"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM5"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM6"));
		paramList.add(JournalUtil.getPropertyValue("JOURNAL_POSTMASS_PARAM7"));
		try {
			essJobStatusId = erpService.submitESSJobRequest(jobPackageName, jobDefinitionName, paramList);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return essJobStatusId;
	}

	private static void downLoadExecDetailsAndSendEmail(Long jobRequestId, String essSubmittedJobStatusIL, String localLogDirectory,String subject,String message ) throws IOException {
		ErpIntegrationService erpService = FusionCloudDataIntegrationService.getErpIntegrationService();
		List<DocumentDetails> jobExecutionDetails = null;
		try {
			jobExecutionDetails = erpService.downloadESSJobExecutionDetails(String.valueOf(jobRequestId), null);
		} catch (ServiceException e) {

			e.printStackTrace();
		} 
		logger.debug("Job Execution Details List Size: " + jobExecutionDetails.size());
		
		byte[] fileContent;
		String fileName = null;
		//String subject = null;
		
		logger.debug(jobExecutionDetails.size());

//		Send these details if we are sending email 

		if (jobExecutionDetails != null && !jobExecutionDetails.isEmpty()) {
			for (DocumentDetails jobExecDetail : jobExecutionDetails) {
				fileName = jobExecDetail.getDocumentName().getValue();
				logger.debug("Job Execution Detail: FileName: " + fileName);
				fileContent = jobExecDetail.getContent();
				// File logFile = new File(localLogDirectory + "/"+fileName);
				Path logFilePath = FileSystems.getDefault().getPath(localLogDirectory, fileName);
				Files.write(logFilePath, fileContent, StandardOpenOption.CREATE_NEW);
				subject=essSubmittedJobStatusIL+" "+subject+" - "+fileName;
				subject=subject.substring(0, subject.lastIndexOf("."));
				logger.debug("subject"+subject);
//				
				logger.debug("message send and deleting files under unzip folder");
				//Thread.sleep(300000);
//				File logZipFilePath=new File(localLogDirectory);
//				File[] dataFilesDeletList = logZipFilePath.listFiles();
//				for (int i = 0; i < dataFilesDeletList.length; i++) {
//					logger.debug("dataFilesDeletList[i].getName()"+dataFilesDeletList[i].getName());
//					CommonMethods.deleteFile(localLogDirectory+dataFilesDeletList[i].getName());
//					logger.debug("End deleting file"+localLogDirectory+dataFilesDeletList[i].getName());
//				}
				
				
			}
			File filePath = new File(JournalUtil.getPropertyValue("JOURNAL_DOWNLOAD_FILES", "dmi"));
			File downloadedSourceFiles = new File(JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME", "dmi"));
			File[] downloadedFilesList = downloadedSourceFiles.listFiles(); // get all the downloaded logs files, add to list, zip the files
			List<File> downloadedFileList = new ArrayList<File>();
			for (File file : downloadedFilesList) {
				logger.debug("Let us process file: " + file.getAbsolutePath());
				downloadedFileList.add(file);
			}
			CommonMethods.zipFiles(filePath, downloadedFileList);
			File fileList = new File(JournalUtil.getPropertyValue("JOURNAL_FILES", "dmi").trim());
			File[] files =   fileList.listFiles();
			CommonMethods.moveFiles(files, JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE_PATH", "dmi"));
			String fileToSend = JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE", "dmi");
			MailManager.sendMailWithAttachment(JournalUtil.getPropertyValue("MAIL_USER_FROM_ADDRESS"),
				JournalUtil.getPropertyValue("MAIL_USER_TO_ADDRESS"), subject, message,
				fileToSend);
			File deleteDirectoryPath =new File(JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME", "dmi"));
			File[] filesDeletList = deleteDirectoryPath.listFiles();
			for (int i = 0; i < filesDeletList.length; i++) {
				logger.debug("dataFilesDeletList[i].getName()"+filesDeletList[i].getName());
				CommonMethods.deleteFile(localLogDirectory+"\\"+filesDeletList[i].getName());
				logger.debug("End deleting file"+localLogDirectory+filesDeletList[i].getName());
			}
			File deleteProcessesFilesDirectoryPath =new File(JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE_PATH", "dmi"));
			File[] ProcessesfilesList = deleteProcessesFilesDirectoryPath.listFiles();
			for (int i = 0; i < ProcessesfilesList.length; i++) {
				logger.debug("dataFilesDeletList[i].getName()"+filesDeletList[i].getName());
				CommonMethods.deleteFile(deleteProcessesFilesDirectoryPath+"\\"+ProcessesfilesList[i].getName());
				logger.debug("End deleting file"+deleteProcessesFilesDirectoryPath+ProcessesfilesList[i].getName());
			}
		}
		
		
		
	}
	
	public static void zipDownloadedFilesAndSendMail() throws IOException {
		String localLogDirectory = JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME","dmi").trim();
		String subject = "AMSI JOURNAL";
		String message = "AMSI JOURNAL";
		File filePath = new File(JournalUtil.getPropertyValue("JOURNAL_DOWNLOAD_FILES", "dmi"));
		File downloadedSourceFiles = new File(JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME", "dmi"));
		File[] downloadedFilesList = downloadedSourceFiles.listFiles(); // get all the downloaded logs files, add to list, zip the files
		List<File> downloadedFileList = new ArrayList<File>();
		for (File file : downloadedFilesList) {
			logger.debug("Let us process file: " + file.getAbsolutePath());
			downloadedFileList.add(file);
		}
		CommonMethods.zipFiles(filePath, downloadedFileList);
		File fileList = new File(JournalUtil.getPropertyValue("JOURNAL_FILES", "dmi").trim());
		File[] files =   fileList.listFiles();
		CommonMethods.moveFiles(files, JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE_PATH", "dmi"));
		String fileToSend = JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE", "dmi");
		MailManager.sendMailWithAttachment(JournalUtil.getPropertyValue("MAIL_USER_FROM_ADDRESS"),
			JournalUtil.getPropertyValue("MAIL_USER_TO_ADDRESS"), subject, message,
			fileToSend);
		File deleteDirectoryPath =new File(JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME", "dmi"));
		File[] filesDeletList = deleteDirectoryPath.listFiles();
		for (int i = 0; i < filesDeletList.length; i++) {
			logger.debug("dataFilesDeletList[i].getName()"+filesDeletList[i].getName());
			CommonMethods.deleteFile(localLogDirectory+"\\"+filesDeletList[i].getName());
			logger.debug("End deleting file"+localLogDirectory+filesDeletList[i].getName());
		}
		File deleteProcessesFilesDirectoryPath =new File(JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE_PATH", "dmi"));
		File[] ProcessesfilesList = deleteProcessesFilesDirectoryPath.listFiles();
		for (int i = 0; i < ProcessesfilesList.length; i++) {
			logger.debug("dataFilesDeletList[i].getName()"+filesDeletList[i].getName());
			CommonMethods.deleteFile(deleteProcessesFilesDirectoryPath+"\\"+ProcessesfilesList[i].getName());
			logger.debug("End deleting file"+deleteProcessesFilesDirectoryPath+ProcessesfilesList[i].getName());
		}
		
	}
	

}
