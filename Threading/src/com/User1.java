package com;

public class User1 {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			public void run() {
				
				System.out.println("Runnable Object");
			}
			
		}).start();
	
		
	}

}
