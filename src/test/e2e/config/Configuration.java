package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configuration {
	
	@Test
	public void testConfig() throws Exception {
		
		// Specify the file location I used . operation here because
		//we have object repository inside project directory only
		File src=new File("./locatorproperties");
		 
		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		 
		// Create Properties class object to read properties file
		Properties pro=new Properties();
		 
		// Load file so we can use into our script
		pro.load(fis);
		 
		System.out.println("Property class loaded");
	}

}
