package com.example;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo7 {
	
	public static void main(String[] args) throws ParseException {
	
		String str = "22/05/2025";
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d=sdf.parse(str);
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1990));
		
	}

}
