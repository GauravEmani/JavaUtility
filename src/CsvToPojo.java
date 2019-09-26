import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.opencsv.*; 

public class CsvToPojo {

	public CsvToPojo() {
		// TODO Auto-generated constructor stub
	}
	
	// Java code to illustrate 
	// Reading CSV File with different separator 
	public static void readDataFromCustomSeperator(String file) 
	{ 
	    try { 
	        // Create an object of file reader class with CSV file as a parameter. 
	        FileReader filereader = new FileReader(file); 
	  
	        // create csvParser object with 
	        // custom seperator semi-colon 
	        CSVParser parser = new CSVParserBuilder().withSeparator(';').build(); 
	  
	        // create csvReader object with parameter 
	        // filereader and parser 
	        CSVReader csvReader = new CSVReaderBuilder(filereader) 
	                                  .withCSVParser(parser) 
	                                  .build(); 
	  
	        // Read all data at once 
	        List<String[]> allData = csvReader.readAll(); 
	        
	        ObjectMapper mapper = new ObjectMapper();
		    mapper.enable(SerializationFeature.INDENT_OUTPUT);
		    mapper.writeValue(System.out, allData);
	        /*// Print Data. 
	        for (String[] row : allData) { 
	            for (String cell : row) { 
	                System.out.print(cell + "\t"); 
	            } 
	            System.out.println(); 
	        } */
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	} 
	
	public void useTheCsvClassParser(String csvFile) {
		
			InputStream in;
			try {
				in = new FileInputStream(csvFile);
			
		    CSV csv = new CSV(true, ',', in );
		    List < String > fieldNames = null;
		    if (csv.hasNext()) fieldNames = new ArrayList < > (csv.next());
		    List < Map < String, String >> list = new ArrayList < > ();
		    while (csv.hasNext()) {
		        List < String > x = csv.next();
		        Map < String, String > obj = new LinkedHashMap < > ();
		        for (int i = 0; i < fieldNames.size(); i++) {
		            obj.put(fieldNames.get(i), x.get(i));
		        }
		        list.add(obj);
		    }
		    ObjectMapper mapper = new ObjectMapper();
		    mapper.enable(SerializationFeature.INDENT_OUTPUT);
		    FileOutputStream fos = new FileOutputStream(new File("input3.json"));
		    //mapper.writeValue(System.out, list);
		    mapper.writeValue(fos, list);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		CsvToPojo csvP = new CsvToPojo();
		//csvP.readDataFromCustomSeperator("input2.csv");
		csvP.useTheCsvClassParser("input2.csv");
		
		
	}

}
