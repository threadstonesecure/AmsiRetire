/**
 * 
 */
package gov.shelby.journalimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import cloud.data.integration.common.util.CommonMethods;
import cloud.data.integration.module.journal.exception.JournalImportException;
import cloud.data.integration.module.journal.model.JournalCSVDataMapping;

/**
 * @author LBerwa
 *
 */
public class JournalImportMappingApp {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
public void run() {
		JournalImportMappingApp journal = new JournalImportMappingApp();
		
    	try {
			//journal.readJournalImportCSVFile();
			//journal.processColumnMapping();
    		journal.readCSVFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void readJournalImportCSVFile() throws IOException, JournalImportException {
    	JournalImportApp app = new JournalImportApp();
    	
    	//GET Files from FTP Location and store them in the /JournalImport/Journal/Source folder
    	
    	
    	File sourceCSVFile = new File(CommonMethods.getPropertyValue("SOURCE_FILE_PATH"));
    	File [] sourceFilesList = sourceCSVFile.listFiles();
    	if(sourceFilesList == null) {
    		//System.out.println("Journal Source File Path Does Not Exist.");
    		throw new JournalImportException("Journal Source File Path does not exist.");
    	}    	
    	
    	List<JournalCSVDataMapping> csvData = null;
    	CsvToBeanBuilder<JournalCSVDataMapping> csvToBeanBuilder = null;
    	
    	    	
    	for(File sourceCSV : sourceFilesList) {
    	 	csvToBeanBuilder = new CsvToBeanBuilder<JournalCSVDataMapping>(new FileReader(sourceCSV));
    	 	csvToBeanBuilder.withType(JournalCSVDataMapping.class); 
    		csvData = csvToBeanBuilder.build().parse();
    	}
        	
    	Writer writer = new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME"));
    	StatefulBeanToCsvBuilder<JournalCSVDataMapping> beanToCsv = new StatefulBeanToCsvBuilder<JournalCSVDataMapping>(writer);
        try {
			beanToCsv.build().write(csvData); 
			writer.flush();
			writer.close();
			
		} catch (CsvDataTypeMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvRequiredFieldEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	public void processColumnMapping() throws JournalImportException, IOException {
		
		File inboundSourceCSVFile = new File(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME"));
	 
		CSVReader reader = new CSVReaderBuilder(new FileReader(inboundSourceCSVFile))
			.withSkipLines(1)
			//.withCSVParser(parser)
			.build();
		
		CSVWriter writer = new CSVWriter(new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME_WITHOUT_HEADER")));
		
		String element[] = null;
	    while((element = reader.readNext()) != null){
	        element = Arrays.copyOf(element, element.length);
	        //element[element.length - 1] = "JSON";
	        writer.writeNext(element);
	    }
	    
	    writer.close();
	 
/*		
		List<String[]> readLines = reader.readAll();
		Writer writer2 = new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME_WITHOUT_HEADER"));
    	CSVWriter csvWriter = new CSVWriter(writer2);
    	csvWriter.writeAll(readLines);
    	csvWriter.flush();
    	csvWriter.close();
	*/		
	}
	
	public void readCSVFile() throws IOException, JournalImportException {
		
		File sourceCSVFile = new File(CommonMethods.getPropertyValue("SOURCE_FILE_PATH"));
    	File [] sourceFilesList = sourceCSVFile.listFiles();
    	if(sourceFilesList == null) {
    		//System.out.println("Journal Source File Path Does Not Exist.");
    		throw new JournalImportException("Journal Source File Path does not exist.");
    	}    
    	for(File sourceCSV : sourceFilesList) {
    		
    	 	CSVReader reader = new CSVReaderBuilder(new FileReader(sourceCSV))
        			.withSkipLines(1)
        			//.withCSVParser(parser)
        			.build();
        	
        	List<String[]> readLines = reader.readAll();
        	Writer writer2 = new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME_WITHOUT_HEADER"));
        	CSVWriter csvWriter = new CSVWriter(writer2);
        	
        	csvWriter.writeAll(readLines);
        	csvWriter.close();
    	}
    	
		//File inboundSourceCSVFile = new File(CommonMethods.getPropertyValue("SOURCE_FILE_PATH")+"/GL_Journal_Sample.csv");
		 
		
	}

}
