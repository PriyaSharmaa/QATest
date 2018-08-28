package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LocatorsReader {
	
Properties pro;
	
	public LocatorsReader() {
		
		
		
		// Specify the file location I used . operation here because
				//I have object repository inside project directory only
		
		try {
		File src=new File("./configurations/config.properties");
	
						// Create  FileInputStream object
				FileInputStream fis=new FileInputStream(src);
				
				 
				// Create Properties class object to read properties file
				 pro=new Properties();
				 
				// Load file so we can use into our script
				pro.load(fis);
		
		}
				catch(Exception e) {
					System.out.println("Exception is:-" +e.getMessage());
				}
				
	}


}
