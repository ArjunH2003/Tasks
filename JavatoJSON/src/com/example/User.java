package com.example;

import com.google.gson.Gson;

public class User {
	
	public static void main(String[] args) {
		
		EmployeeBean eb = new EmployeeBean();
		eb.setEid(101);
		eb.setEname("Vijay");
		eb.setEsal(60000);
		Gson obj = new Gson();
		String str = obj.toJson(eb);
		System.out.println(str);
	}
	
}	
	
	
	
