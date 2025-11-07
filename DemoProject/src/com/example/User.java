package com.example;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class User {
	
	public static void main(String[] args) {
	
		JButton jb = new JButton("Click me");
		String name = JOptionPane.showInputDialog("Enter your name");
		String s1 =  JOptionPane.showInputDialog("Enter a number");
		int s2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
		int a = Integer.parseInt(s1);
		JOptionPane.showMessageDialog(null,"Hai "+name+" Welcome to UST");
		JOptionPane.showMessageDialog(null,"Sum is : "+(a+s2));
	}

}
