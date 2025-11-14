package com.example;

public class ToString {
	
	record Employee(int empid,String empname) {}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Vijay");
		Employee e2 = new Employee(101,"Vijay");
		System.out.println(e1.equals(e2));
	}

}

