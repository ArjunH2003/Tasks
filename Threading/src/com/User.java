package com;

public class User {
	
	public static void main(String[] args) {
		
		A th1 = new A();// if runnable then create a thread object and pass A object to it and call start with thread object
		
		B th2 = new B();
		
		th1.start();
		
		th2.start();
	}

}
