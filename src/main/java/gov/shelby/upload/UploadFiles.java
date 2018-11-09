package gov.shelby.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cloud.data.integration.common.util.CommonMethods;
import gov.shelby.upload.service.UploadService;
import gov.shelby.upload.util.*;

public class UploadFiles {
	final static Logger logger = Logger.getLogger(UploadFiles.class);

	public static void main(String[] args) {

		initializeLog4j();
		System.setProperty("org.xml.sax.driver", "com.sun.org.apache.xerces.internal.parsers.SAXParser");
		System.setProperty("javax.xml.parsers.DocumentBuilderFactory",
				"com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
		System.setProperty("javax.xml.parsers.SAXParserFactory",
				"com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
		try {
			String sourceFilePath = JournalUtil.getPropertyValue("JOURNAL_SOURCE_FILE_PATH", "dmi");
			String fileNameLocation = JournalUtil.getPropertyValue("JOURNAL_ZIP_DIRECTORY_NAME", "dmi");
			String archiveLocation = JournalUtil.getPropertyValue("JOURNAL_PROCESSED_FILE_PATH", "dmi");
			String zipFileNameAndLocation = JournalUtil.getPropertyValue("JOURNAL_ZIP_FILE_PATH_NAME", "dmi");
			String localLogDirectory = JournalUtil.getPropertyValue("JOURNAL_LOG_DIRECTORY_NAME", "dmi").trim();
//			String inboundFileName = JournalUtil.getPropertyValue("JOURNAL_INBOUND_CSV_COLUMN_MAPPED_FILE_NAME", "dmi")
//					.trim();
			String docAccount = "fin$/assets$/import$";
			long jobRequestId = 0;
			String essSubmittedJobStatusIL = null;
			String serverReturnedDocId = null;

			logger.debug("Starting reading files from sourceFilePath " + sourceFilePath + "\n");
			File downloadedSourceFiles = new File(sourceFilePath);
			File[] downloadedFilesList = downloadedSourceFiles.listFiles();
			List<File> inboundFileList = new ArrayList<File>();
			for (File file : downloadedFilesList) {
				logger.debug("Let us process file: " + file.getAbsolutePath());
				inboundFileList.add(file);
			}
			logger.debug("Zip File Path " + zipFileNameAndLocation);
			File zipFileName = new File(zipFileNameAndLocation);
			CommonMethods.zipFiles(zipFileName, inboundFileList);

			logger.debug("fileNameLocation" + fileNameLocation);
			logger.debug("docAccount" + docAccount);

			if (fileNameLocation.isEmpty()) {
				logger.error("file name is empty. please provide a file name");
				throw new Exception("Please provide a file name");
			}

			if (docAccount.isEmpty()) {
				logger.error("docAccount is empty. please provide a docAccount");
				throw new Exception("Please provide a docAccount");
			}

			logger.info("Started file upload process for file name location " + fileNameLocation + " " + new Date());

			serverReturnedDocId = UploadService.uploadFileToFusion(fileNameLocation, docAccount, archiveLocation,
					localLogDirectory);
			logger.debug("Server Returned Document Id: " + serverReturnedDocId);
			logger.info("End file upload process " + new Date());

			jobRequestId = UploadService.submitESSJobRequest(serverReturnedDocId);
			Thread.sleep(60000);

			logger.debug("Start making a call to getJobStatus " + new Date());
			essSubmittedJobStatusIL = UploadService.getESSJobStatus(jobRequestId);
			logger.debug("End making a call to getJobStatus " + new Date());
			logger.debug("getJobStatus ESSJob Status: [" + essSubmittedJobStatusIL + "]");
			UploadService.checkStatusAndExecEmail(essSubmittedJobStatusIL, jobRequestId);

			if (downloadedFilesList.length > 0) {
				logger.debug("Moving files size" + downloadedFilesList.length);
				logger.debug("Moving files processedFilePath" + archiveLocation);
				Thread.sleep(5000);
				CommonMethods.moveFiles(downloadedFilesList, archiveLocation);
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Exception while uploading the file " + e.getMessage());
		}
	}

	public static void initializeLog4j() {
		BasicConfigurator.configure();
		final String LOG_FILE = JournalUtil.getPropertyValue("JOURNAL_LOG_PROPERTY_FILE");
		Properties logProp = new Properties();
		try {
			logProp.load(new FileInputStream(LOG_FILE));
			PropertyConfigurator.configure(logProp);
			logger.info("Logging enabled");
		} catch (IOException e) {
			logger.error("Log4j logging not enabled...");
			logger.error(e.getMessage());
		}
	}
}
