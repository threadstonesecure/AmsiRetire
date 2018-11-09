package cloud.data.integration.module.journal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cloud.data.integration.module.journal.util.JournalUtil;


/**
 * This is the main class for processing the General Ledger Journal Import
 * processing functionality.
 * 
 * @author LBerwa
 *
 */
public class JournalApp {

	final static Logger logger = Logger.getLogger(JournalApp.class);
	public static void main(String[] args) {
		initializeLog4j();
		 logger.debug("Starting main thread"+ new Date() );
	     JournalAppRunnable jaRunnable=new JournalAppRunnable(args[0]);
		 System.setProperty("org.xml.sax.driver", "com.sun.org.apache.xerces.internal.parsers.SAXParser");
		 System.setProperty("javax.xml.parsers.DocumentBuilderFactory","com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
		 System.setProperty("javax.xml.parsers.SAXParserFactory","com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
		
		 Thread t = new Thread(jaRunnable);
		 t.start();
		 logger.debug("End main thread"+ new Date());
	}
	public static void initializeLog4j() {
		BasicConfigurator.configure();
		final String LOG_FILE = JournalUtil.getPropertyValue("JOURNAL_LOG_PROPERTY_FILE"); 
	      Properties logProp = new Properties();      
	      try {      
	    	  logProp.load(new FileInputStream (LOG_FILE));  
	          PropertyConfigurator.configure(logProp);      
	          logger.info("Logging enabled");
	      }catch(IOException e) {       
	    	  logger.error("Log4j logging not enabled..."); 
	    	  logger.error(e.getMessage());
	      }  
	}
	
}
