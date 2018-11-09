package cloud.data.integration.module.journal;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import cloud.data.integration.common.erpintegrationservice.webservice.DocumentDetails;
import cloud.data.integration.common.erpintegrationservice.webservice.ServiceException;
import cloud.data.integration.common.util.CommonMethods;
import cloud.data.integration.common.util.MailManager;
import cloud.data.integration.module.journal.exception.JournalImportException;
import cloud.data.integration.module.journal.service.JournalImportService;
import cloud.data.integration.module.journal.util.JournalUtil;

public class JournalAppRunnable implements Runnable{

	final static Logger logger = Logger.getLogger(JournalAppRunnable.class);
	private String customFile=null;
	public JournalAppRunnable(String customFile) {
		// TODO Auto-generated constructor stub
		this.customFile=customFile;
	}

	public void run()
	{
		try {
			logger.debug("Starting new thread to processJournalImport for"+ customFile);
			processJournalImport(customFile);
			logger.debug("End processing processJournalImport");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception: " +e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void processJournalImport(String customFile) throws Exception {
		String sourceFilePath = JournalUtil.getPropertyValue("JOURNAL_SOURCE_FILE_PATH",customFile);
		String inboundFileName = JournalUtil.getPropertyValue("JOURNAL_INBOUND_CSV_COLUMN_MAPPED_FILE_NAME",customFile);
		String processedFilePath = JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE_PATH",customFile);
		String zipFileNameAndLocation = JournalUtil.getPropertyValue("JOURNAL_ZIP_FILE_PATH_NAME",customFile);
		String remoteDirectory = JournalUtil.getPropertyValue("JOURNAL_SFTP_SERVER_REMOTE_SOURCE_DIRECTORY",customFile).trim();
		String localDirectory = JournalUtil.getPropertyValue("JOURNAL_SOURCE_FILE_PATH",customFile).trim();
		String localLogDirectory = JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME",customFile).trim();
		JournalImportService journalImportService = new JournalImportService();
		boolean validRecord = false;
		
		logger.debug("sourceFilePath"+sourceFilePath);
		logger.debug("localLogDirectory"+localLogDirectory);
		
		try {
			//logger.debug("Started download source file from SFTP Server");
			//SFTPManager.downloadSourceFileFromSFTPServer(remoteDirectory, localDirectory);
			//SFTPManager.deleteSourceFilesFromSFTPServer(remoteDirectory);
			// FusionCloudDataIntegrationService service = new
			// FusionCloudDataIntegrationService();
			logger.debug("Starting reading files from sourceFilePath "+sourceFilePath+"\n");
			File downloadedSourceFiles = new File(sourceFilePath);
			File[] downloadedFilesList = downloadedSourceFiles.listFiles();
			if(downloadedFilesList.length==0) {
				
				logger.error("Files dosn't exists in source folder. Please keep the files in source folder and try again");
			}
			for (File file : downloadedFilesList) {
				logger.debug("Let us process file: " + file.getAbsolutePath());
				//logger.info("Let us process file: " + file.getAbsolutePath());
				// CommonMethods.processCSVFile(file.getAbsolutePath(), inboundFileName);
				logger.debug("Start making a call to processJournalCSVFileWithColumnMapping "+ new Date() );
				validRecord = journalImportService.processJournalCSVFileWithColumnMapping(file.getAbsolutePath(),
						inboundFileName);
				logger.debug("End making a call to processJournalCSVFileWithColumnMapping "+ new Date() );
				if (validRecord) {
					File zipFileName = new File(zipFileNameAndLocation);
					List<File> inboundFileList = new ArrayList<File>();
					inboundFileList.add(new File(inboundFileName));
					CommonMethods.zipFiles(zipFileName, inboundFileList);
                    logger.debug("Start making a call to uploadFileToFusion "+ new Date() );
					String documentId = journalImportService.uploadFileToFusion(zipFileNameAndLocation,customFile);
					logger.debug("End making a call to uploadFileToFusion "+ new Date() );
					logger.debug("Start making a call to submitESSJobRequestForInterfaceLoader "+ new Date() );
					long jobRequestIdIL = journalImportService.submitESSJobRequestForInterfaceLoader(documentId);
					logger.debug("End making a call to submitESSJobRequestForInterfaceLoader "+ new Date() );
					logger.debug("ESSJob Submitted Request Id: " + jobRequestIdIL);
					
					//logger.debug("Thread is started sleeping 2 Sec " + new Date());
					Thread.sleep(2000);
					//logger.debug("Thread is End sleeping " + new Date());
					// String essSubmittedJobStatusq =
					// journalImportService.getESSJobStatus(jobRequestId);

					// logger.debug("essSubmittedJobStatus Status: " +
					// essSubmittedJobStatusq);
					logger.debug("Start making a call to getJobStatus "+ new Date() );
					String essSubmittedJobStatusIL = journalImportService.getJobStatus(jobRequestIdIL);
					logger.debug("End making a call to getJobStatus "+ new Date() );
					logger.debug("getJobStatus ESSJob Status: [" + essSubmittedJobStatusIL+"]");

					String subject = null;
					String message = null;

					if (essSubmittedJobStatusIL.equalsIgnoreCase("ERROR")) {
						logger.debug(
								"An error has occurred at Oracle Fusion Server while processing the submitted ESSJob");
						subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_SUBJECT_LINE_LOAD_INTERFACE");
						message = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_TEXT_FOR_JOURNAL_IMPORT");
						downLoadExecDetailsAndSendEmail(journalImportService,jobRequestIdIL,essSubmittedJobStatusIL,localLogDirectory,subject,message);
					} else if (essSubmittedJobStatusIL.equalsIgnoreCase("WARNING")) {
						subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_SUBJECT_LINE_LOAD_INTERFACE");
						message = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_TEXT_FOR_JOURNAL_IMPORT");
						downLoadExecDetailsAndSendEmail(journalImportService,jobRequestIdIL,essSubmittedJobStatusIL,localLogDirectory,subject,message);
					} else if (essSubmittedJobStatusIL.equalsIgnoreCase("RUNNING")) {
						subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_SUBJECT_LINE_LOAD_INTERFACE");
						message = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_TEXT_FOR_JOURNAL_IMPORT");
						downLoadExecDetailsAndSendEmail(journalImportService,jobRequestIdIL,essSubmittedJobStatusIL,localLogDirectory,subject,message);
					} else if (essSubmittedJobStatusIL.equalsIgnoreCase("SUCCEEDED")) {

						subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_SUBJECT_LINE_LOAD_INTERFACE");
						message = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_TEXT_FOR_JOURNAL_IMPORT");
						// Load is success full so send the email for load
						downLoadExecDetailsAndSendEmail(journalImportService,jobRequestIdIL,essSubmittedJobStatusIL,localLogDirectory,subject,message);
						// START THE ESS JOB REQUEST TO IMPORT JOURNALS
						Long journalImportrequestId = journalImportService
								.submitESSJobRequestForJournalImport(file.getAbsolutePath());
						logger.debug("wait for 10 Sec");
						logger.debug("Thread is started sleeping " + new Date());
						Thread.sleep(10000);
						logger.debug("Thread is End sleeping " + new Date());
						logger.debug("Start making a call to getJobStatus request Id "+journalImportrequestId );
						String journalImportESSJobStatus = journalImportService.getJobStatus(journalImportrequestId);
						logger.debug("End making a call to getJobStatus "+ new Date() );
						logger.debug(" getJobStatus journalImportESSJobStatus [" + journalImportESSJobStatus + "]");
						
						// String message =
						// CommonMethods.getPropertyValue("MAIL_MESSAGE_TEXT_FOR_JOURNAL_IMPORT");
						
								if (journalImportESSJobStatus.equalsIgnoreCase("ERROR")) {
									logger.debug(
											"An error has occurred at Oracle Fusion Server while processing the submitted ESSJob");
									subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_SUBJECT_LINE");
									message = JournalUtil.getPropertyValue("MAIL_MESSAGE_ERROR_TEXT_FOR_JOURNAL_IMPORT");
									downLoadExecDetailsAndSendEmail(journalImportService,journalImportrequestId,journalImportESSJobStatus,localLogDirectory,subject,message);
								} else if (journalImportESSJobStatus.equalsIgnoreCase("SUCCEEDED")) {
									subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_SUBJECT_LINE");
									message = JournalUtil.getPropertyValue("MAIL_MESSAGE_SUCCESS_TEXT_FOR_JOURNAL_IMPORT");
									downLoadExecDetailsAndSendEmail(journalImportService,journalImportrequestId,journalImportESSJobStatus,localLogDirectory,subject,message);
								
								} else if (journalImportESSJobStatus.equalsIgnoreCase("WARNING")) {
									subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_SUBJECT_LINE");
									message = JournalUtil.getPropertyValue("MAIL_MESSAGE_WARNING_TEXT_FOR_JOURNAL_IMPORT");
									downLoadExecDetailsAndSendEmail(journalImportService,journalImportrequestId,journalImportESSJobStatus,localLogDirectory,subject,message);
								} else if (journalImportESSJobStatus.equalsIgnoreCase("RUNNING")) {
									subject = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_SUBJECT_LINE");
									message = JournalUtil.getPropertyValue("MAIL_MESSAGE_RUNNING_TEXT_FOR_JOURNAL_IMPORT");
									downLoadExecDetailsAndSendEmail(journalImportService,journalImportrequestId,journalImportESSJobStatus,localLogDirectory,subject,message);
								} 
								
							}
						
					
					

				}
				// CommonMethods.processCSVFile(sourceFilePath, inboundFileName);
				// journalImportService.processJournalCSVFileWithColumnMapping(sourceFilePath,
				// inboundFileName);
				
			}
			if(downloadedFilesList.length>0) {
	            logger.debug("Moving files size"+downloadedFilesList.length);
	            logger.debug("Moving files processedFilePath"+processedFilePath);
	            Thread.sleep(5000);
				CommonMethods.moveFiles(downloadedFilesList, processedFilePath);
			}
			CommonMethods.deleteFile(inboundFileName);

		} catch (IOException e) {
			logger.error("IOException: " +e.getMessage());
			e.printStackTrace();
		} catch (JournalImportException e) {
			logger.error("JournalImportException: "+e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			logger.error("NullPointerException: "+e.getMessage());
			e.printStackTrace();
		} catch (ServiceException e) {
			logger.error("ServiceException: "+e.getMessage());
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			logger.error("InterruptedException: "+e.getMessage());
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void downLoadExecDetailsAndSendEmail(JournalImportService journalImportService,Long jobRequestId,String essSubmittedJobStatus,String localLogDirectory,String subject,String message) throws ServiceException, IOException 
	{
		List<DocumentDetails> jobExecutionDetails = journalImportService
				.downloadESSJobExecutionDetails(jobRequestId);
		byte[] fileContent;
		String fileName = null;
		logger.debug(jobExecutionDetails.size());
		if (jobExecutionDetails != null && !jobExecutionDetails.isEmpty()) {
			for (DocumentDetails jobExecDetail : jobExecutionDetails) {
				fileName = jobExecDetail.getDocumentName().getValue();
				logger.debug("Job Execution Detail: FileName: " + fileName);
				fileContent = jobExecDetail.getContent();
				// File logFile = new File(localLogDirectory + "/"+fileName);
				Path logFilePath = FileSystems.getDefault().getPath(localLogDirectory, fileName);
				Files.write(logFilePath, fileContent, StandardOpenOption.CREATE_NEW);
				subject=essSubmittedJobStatus+" "+subject+" - "+fileName;
				subject=subject.substring(0, subject.lastIndexOf("."));
				logger.debug("subject"+subject);
				MailManager.sendMailWithAttachment(JournalUtil.getPropertyValue("MAIL_USER_FROM_ADDRESS"),
						JournalUtil.getPropertyValue("MAIL_USER_TO_ADDRESS"), subject, message,
						localLogDirectory + "/" + fileName);
				
				logger.debug("message send and deleting files under unzip folder");
				//Thread.sleep(300000);
				File logZipFilePath=new File(localLogDirectory);
				File[] dataFilesDeletList = logZipFilePath.listFiles();
				for (int i = 0; i < dataFilesDeletList.length; i++) {
					logger.debug("dataFilesDeletList[i].getName()"+dataFilesDeletList[i].getName());
					CommonMethods.deleteFile(localLogDirectory+dataFilesDeletList[i].getName());
					logger.debug("End deleting file"+localLogDirectory+dataFilesDeletList[i].getName());
				}
				
				
			}
		}
	}
}
