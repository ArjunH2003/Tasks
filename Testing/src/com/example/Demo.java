package com.example;

import java.io.PrintStream;

public class Demo {
	
	
	public static float PI = 3.14f;
	public static int square(int x) {
		return(x*x);
	}
	
	public static void main(String[] args) {
		
		PrintStream pw = new PrintStream(System.out);
		pw.println("Hello World");
	}

}
