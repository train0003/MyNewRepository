package com.ActionDemo;

import java.util.Calendar;

public class GregorianCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = new java.util.GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.getActualMaximum(Calendar.MONTH);
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("year is"+year);
		System.out.println("month is"+month);
		System.out.println("month is"+dow);

	}

}
