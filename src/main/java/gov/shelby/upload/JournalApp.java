package gov.shelby.upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cloud.data.integration.module.journal.util.JournalUtil;
import gov.shelby.upload.service.UploadService;


public class JournalApp {
	final static Logger logger = Logger.getLogger(JournalApp.class);
	public static void main(String args[]) throws IOException {
		initializeLog4j();
		logger.debug("Starting main thread"+ new Date() );
//		UploadFiles uploadFile = new UploadFiles();
//		Thread t = new Thread(uploadFile);
//		t.run();
		UploadService.zipDownloadedFilesAndSendMail();
		logger.debug("End main thread"+ new Date());
		
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
