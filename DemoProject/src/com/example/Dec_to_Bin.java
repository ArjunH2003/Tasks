package com.example;

import java.util.Scanner;

public class Dec_to_Bin {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String binary = "";
		
		int rem = 0;
		
		while(num>0) {
			
			rem = num%2;
			
			binary = rem+binary;
			
			num=num/2;
			
		}
		
		System.out.println("Decimal to binary : "+binary);
	}
}
