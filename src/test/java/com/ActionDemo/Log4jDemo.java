package com.ActionDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;


public class Log4jDemo {
	
	public static Logger logger = Logger.getLogger("LoggerLogs");

	public static void main(String[] args) throws IOException{
		try {
		FileReader fr = new FileReader("C:\\Seleniumreaddata\\Demo File.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.println((char)i);
		}
		br.close();
		fr.close();
		

	}
		catch(FileNotFoundException fe) {
			logger.debug("Test Manual");
			logger.error("File not found");
			logger.warn("this is a warning message");
			logger.trace("this msg will not be logged since");
		}
		catch(IOException e) {
			logger.error("IOException occured:",e);
		}
			
		}

}
