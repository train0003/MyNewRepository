package com.ActionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;
	public static XSSFRow Row;
	public static XSSFCell Cell;

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream(new File("C:\\Selenium read data\\Demo Excel.xlsx"));
		ExcelWBook  = new XSSFWorkbook(fin) ;
		ExcelWSheet = ExcelWBook.getSheet("sheet1");
		/*
		Cell = ExcelWSheet.getRow(1).getCell(0);//row n column number
		System.out.println("Data:"+Cell.getStringCellValue());*/
		ExcelWSheet.createRow(5);
		Row = ExcelWSheet.getRow(5);
		Cell=Row.createCell(1);
		Cell.setCellValue("New ValueAdded");
		FileOutputStream fout = new FileOutputStream(new File("C:\\Selenium read data\\Demo Excel.xlsx"));
		ExcelWBook.write(fout);
		fout.flush();
		
 }
//writing data in excel sheet1
	
	
	
}
