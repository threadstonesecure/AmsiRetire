package gov.shelby.upload.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import cloud.data.integration.common.util.Packager;
import cloud.data.integration.module.journal.exception.JournalImportException;
import cloud.data.integration.module.journal.service.JournalImportService;

/**
 * 
 * @author SBalawatri
 *
 */
public class JournalUtil {
	final static Logger logger = Logger.getLogger(JournalUtil.class);
	// load the properties only once
	private static Properties properties;
	private static Properties customProperties;

	public static String getPropertyValue (String stringKey){
		// reading property file from outside location
		  //  logger.debug("getting property for key"+stringKey +"value "+JournalUtil.getProperties().getProperty(stringKey));
	    	return JournalUtil.getProperties().getProperty(stringKey);
	}
	
    public static synchronized Properties getProperties() {
        if (properties != null) { return properties; }
        try {
        	properties= new Properties();
	        File jarPath=new File(JournalUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
	        logger.debug(" propertiesPath-"+propertiesPath);
	        logger.debug("loading file");
	        properties.load(new FileInputStream(propertiesPath+"/resources/ApplicationResources_journal.properties"));
	        return properties;
	    } catch (IOException e1) {
	        e1.printStackTrace();
	        logger.error("unable to find property file in running jar location");
	        return null;
	    }
    }
    
    public static synchronized Properties getProperties(String fileName) {
        if (customProperties != null) { return customProperties; }
        try {
        	customProperties= new Properties();
	        File jarPath=new File(JournalUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());
	        String propertiesPath=jarPath.getParentFile().getAbsolutePath();
	        logger.debug("loading file for "+fileName);
	        customProperties.load(new FileInputStream(propertiesPath+"/resources/"+fileName+".properties"));
	        return customProperties;
	    } catch (IOException e1) {
	        e1.printStackTrace();
	        logger.error("unable to find property file in running jar location");
	        return null;
	    }
    }
    public static String getPropertyValue (String stringKey,String fileName){
		// reading property file from outside location
		//    logger.debug("getting property for key"+stringKey+ "filename"+fileName);
	    	return JournalUtil.getProperties(fileName).getProperty(stringKey);
	}

	
	public static File [] checkFilePresence(String fileLocation) {
	
		File folder = new File(fileLocation);
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				logger.debug("Files Available in folder: " + listOfFiles[i].getName());
		    }
		}
		if ((listOfFiles.length == 0) || listOfFiles[0].getName().isEmpty()) {
			logger.debug("File(s) not available in Source folder to Upload.");
		}
		
		return listOfFiles;
	}
	
	/**
	 * This method moves all of the files in the sourceFilePath directory into the destinationFilePath
	 * directory.
	 * @param sourceFilePath
	 * @param processedFilePath
	 * @throws IOException 
	 */
	public static void moveFiles(String sourceFilePath, String destinationFilePath) throws IOException {
		File csvFilePath = new File(sourceFilePath);
		File [] files = csvFilePath.listFiles();
		
		for(File file : files) {
			Path filePath = file.toPath();
			Path destination = new File(destinationFilePath, file.getName()).toPath();
			Files.move(filePath, destination, StandardCopyOption.REPLACE_EXISTING);
		}
	}
	
	public static void deleteFile(String fileName) {
		if(fileName == null) {
			throw new NullPointerException("The file path is null of the file you want to delete.");
		}
		File inboundFile = new File(fileName);
		inboundFile.delete();
	}
	
public static void processCSVFile(String sourceFilePath, String inboundFileName) throws IOException, JournalImportException {
		
		//File sourceCSVFile = new File(CommonMethods.getPropertyValue("SOURCE_FILE_PATH"));
		File sourceCSVFile = new File(sourceFilePath);
    	File [] sourceFilesList = sourceCSVFile.listFiles();
    	if(sourceFilesList.length == 0) {
    		//logger.debug("Journal Source File Path Does Not Exist.");
    		throw new JournalImportException("Source File does not exist in the Source folder. ");
    	}    
    	for(File sourceCSV : sourceFilesList) {
    		
    	 	CSVReader reader = new CSVReaderBuilder(new FileReader(sourceCSV))
        			.withSkipLines(1)
        			//.withCSVParser(parser)
        			.build();
        	
        	List<String[]> readLines = reader.readAll();
        	//Writer writer2 = new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME_WITHOUT_HEADER"));
        	Writer writer2 = new FileWriter(inboundFileName);
        	CSVWriter csvWriter = new CSVWriter(writer2);
        	
        	csvWriter.writeAll(readLines);
        	csvWriter.flush();
        	csvWriter.close();
        	reader.close();
    	}
    	
    	//sourceCSVFile.
		
	}

	public static void zipFiles(File zipFileName, List<File> sources) throws IOException {
		Packager.packZip(zipFileName, sources);
	}
}
