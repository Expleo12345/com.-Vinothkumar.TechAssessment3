package com.Vinothkumar.TechAssessment3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class UtilityClass {
	String strEmail,strPassword,strUrl;
	public UtilityClass(){
		credentials();
	}
	public void credentials() {
File file = new File("C:\\Users\\vbalamurugan\\eclipse-workspace1\\com.Vinothkumar.TechAssessment3\\src\\test\\resources\\Features\\login.properties");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		Properties property = new Properties();
		
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		strUrl=property.getProperty("url");
		strEmail = property.getProperty("Email");
		strPassword = property.getProperty("password");
	}
}