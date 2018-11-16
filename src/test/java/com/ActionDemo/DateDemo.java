package com.ActionDemo;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
/*Date date = new Date();
System.out.println(date.toString());
SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss z");
System.out.println("Current date: "+ft.format(date));*/ //@1st date program
		String time1 = "10:00:00";
		String time2 = "21:00:00";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
				System.out.println("difference:"+difference);
	}

}
