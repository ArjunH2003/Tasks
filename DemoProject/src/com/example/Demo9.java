package com.example;

import java.time.LocalDate;

public class Demo9 {
	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.isLeapYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.minusDays(10));
		
	}
}
		
		