package com.example;

public class Except {
	
	static int a[] = new int[5];
	
	
	public static void div(int x,int y) {
		
		a[12] = 15;
		
		
		try {
			System.out.println("Division : "+(x/y));
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero not possible."+e);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array out of bounds"+a);
			a.printStackTrace();
		}
		finally {
			System.out.println("Closing a resource");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("------Division------");
		Except.div(20, 0);
	}

}
