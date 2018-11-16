package com.ActionDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;



public class ReadingFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Selenium read data\\Demo File.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.println((char)i);
		}
		br.close();
		fr.close();
	}

}
