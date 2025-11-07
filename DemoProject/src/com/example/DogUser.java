package com.example;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DogUser {
	
	public static void main(String[] args) {
		//Dog d1 = new Dog();
		//d1.eat();
		Dog.main(null); // to access main class of Dog by DogUser class 
		JButton jb = new JButton("Click me");
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null,"Hai "+name+" Welcome to UST");
	}

}
