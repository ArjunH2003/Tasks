package com.example;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		if(b%2 == 0) {
			JOptionPane.showMessageDialog(null,"The number is even!");
		}
		else {
			JOptionPane.showMessageDialog(null,"The number is odd!");
		}
		
		//System.out.println("Enter the number : ");
		//Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		
		//if(a%2 == 0) {
		//	System.out.println("The number is even!");
		//}
		//else {
		//	System.out.println("The number is odd!");
	//	}
		
		
	}
	
	
	
}
