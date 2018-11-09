package gov.shelby.journalimport;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import cloud.data.integration.common.util.CommonMethods;
import cloud.data.integration.module.journal.exception.JournalImportException;
import cloud.data.integration.module.journal.model.JournalCSVColumnMapping;
import cloud.data.integration.module.journal.model.JournalCSVDataMapping;
import cloud.data.integration.module.journal.service.JournalImportService;

/**
 * LBerwa
 *
 */
public class JournalImportApp {
	
    //public static void main( String[] args ) {
    	public void run() {
    	JournalImportApp journal = new JournalImportApp();
    	try {
			journal.processJournalImportFiles();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JournalImportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    
    public void processJournalImportFiles() throws IOException, JournalImportException {
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
    	 	//csvToBeanBuilder.withMappingStrategy(strategy);
    		//csvToBeanBuilder.build().setCsvReader(csvReader);
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
 
   	
        Map<String, String> columnMapping = new HashMap<String, String>();
    	columnMapping.put("STATUS CODE", "statusCode");
    	columnMapping.put("LEDGER ID", "ledgerId");
    	columnMapping.put("EFFECTIVE DATE OF TRANSACTION", "effectiveDateOfTransaction");

    	
    	HeaderColumnNameTranslateMappingStrategy<JournalCSVColumnMapping> strategy = new HeaderColumnNameTranslateMappingStrategy<JournalCSVColumnMapping>();
    	strategy.setType(JournalCSVColumnMapping.class);
    	strategy.setColumnMapping(columnMapping);
        
    	File inboundSourceCSVFile = new File(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME"));
    	//File [] inboundSourceFilesList = inboundSourceCSVFile.listFiles();
    	if(inboundSourceCSVFile == null) {
    		System.out.println("Journal Source File Path Does Not Exist.");
    		throw new JournalImportException("Journal Inbound Source File Path does not exist.");
    	}    	
    	
    	CsvToBean<JournalCSVColumnMapping> csvToBean = new CsvToBean<JournalCSVColumnMapping>();
    	List<JournalCSVColumnMapping> inboundCsvData = null;
    	CSVReader inboundReader = new CSVReader(new FileReader(inboundSourceCSVFile));
    	inboundCsvData = csvToBean.parse(strategy, inboundReader);
   /* 	
    	CsvToBeanBuilder<JournalCSVColumnMapping> inboundCsvToBeanBuilder = null;
    	
    	//for(File sourceCSV : inboundSourceFilesList) {
    	 	inboundCsvToBeanBuilder = new CsvToBeanBuilder<JournalCSVColumnMapping>(new FileReader(inboundSourceCSVFile));
    	 	inboundCsvToBeanBuilder.withMappingStrategy(strategy);
    	 	inboundCsvToBeanBuilder.withType(JournalCSVColumnMapping.class); 
    		//csvToBeanBuilder.build().setCsvReader(csvReader);
    		inboundCsvData = inboundCsvToBeanBuilder.build().parse();
    	//}
    */	
    	Writer inboundWriter = new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_COLUMN_MAPPED_FILE_NAME"));
    	StatefulBeanToCsvBuilder<JournalCSVColumnMapping> inboundBeanToCsv = new StatefulBeanToCsvBuilder<JournalCSVColumnMapping>(inboundWriter);
        try {
			inboundBeanToCsv.build().write(inboundCsvData); 
			  inboundWriter.close();
		} catch (CsvDataTypeMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvRequiredFieldEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	CSVReader reader =
    			new CSVReaderBuilder(new FileReader(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME")))
    			.withSkipLines(1)
    			//.withCSVParser(parser)
    			.build();
    	
    	List<String[]> readLines = reader.readAll();
    	Writer writer2 = new FileWriter(CommonMethods.getPropertyValue("INBOUND_CSV_FILE_NAME_WITHOUT_HEADER"));
    	CSVWriter csvWriter = new CSVWriter(writer2);
    	
    	csvWriter.writeAll(readLines);
    	csvWriter.close();
   
    	
    	File file = new File(CommonMethods.getPropertyValue("INBOUND_FILE_PATH"));
		File [] inboundfilesArray = file.listFiles();
		if(inboundfilesArray == null) {
    		throw new JournalImportException("Journal Inbound File Path does not exist.");
    	}
		List<File> sourcefilesList = Arrays.asList(inboundfilesArray);
		
		for(File inboundFile : sourcefilesList) {
			File zipFileName = new File(CommonMethods.getPropertyValue("ZIP_FILE_NAME"));
			
			List<File> inboundFileList = new ArrayList<File>();
			inboundFileList.add(inboundFile);
	    	app.zipFiles(zipFileName, inboundFileList);
		}
    }
    
    public void zipFiles(File zipFileName, List<File> sources) throws IOException{
    	
    	JournalImportService service = new JournalImportService();
    	//service.zipFiles(zipFileName, sources);
    }
}
