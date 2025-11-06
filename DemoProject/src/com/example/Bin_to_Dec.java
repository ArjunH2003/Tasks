package com.example;

import java.util.Scanner;

public class Bin_to_Dec {
	
public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int binary = sc.nextInt();
		
		int i = 0;
		
		int remainder = 0;
		int decimal = 0;
		
		while(binary>0) {
			
			remainder = binary%10;
			decimal+=remainder*(int)Math.pow(2, i);
			binary = binary/10;
			i++;
			
			
		}
		
		System.out.println("Binary to decimal : "+decimal);
		

	}
}
