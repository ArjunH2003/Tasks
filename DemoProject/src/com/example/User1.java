package com.example;

import java.io.DataInputStream;

public class User1 {

	public static void main(String[] args) {
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter your name");
		String name = " ";
		try {
			name = dis.readLine();
		}
		
	}
}
