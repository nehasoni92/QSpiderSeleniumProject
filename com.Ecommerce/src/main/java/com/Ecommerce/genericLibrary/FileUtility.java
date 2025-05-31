package com.Ecommerce.genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class FileUtility {
	
	FileInputStream f;
	Properties p;
	
	/**
	 * 
	 * it is used to retrieve the data from properties
	 */
	
	public String getDataFromProperty(String path, String key)
	{
		try {
			
			f = new FileInputStream(path);
			p = new Properties();
			p.load(f);			
		}
		catch (Exception e)
		{
			Reporter.log("Exception Handled");
		}
		
		return p.getProperty(key);
	}

}
