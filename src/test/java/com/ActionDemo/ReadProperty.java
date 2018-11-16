package com.ActionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Eclipse Training\\SeleniumLatest\\src\\test\\resources\\test.properties");
		FileInputStream fileinput = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileinput);
		fileinput.close();
		
		Enumeration enuKeys = properties.keys();
		
		while (enuKeys.hasMoreElements()) {
			String key = (String) enuKeys.nextElement();
			String value = properties.getProperty(key);
			//String urlvalue = properties.getProperty("url"); //if in case we want single key value
			System.out.println(key+":"+value);
			
			//System.out.println("URL INFO:"+urlvalue);
		}
		//writing data in file
		FileOutputStream fout = new FileOutputStream(file);
		properties.setProperty("xpath", "iframes");
		properties.store(fout, null);
		fout.close();
		

	}

}
