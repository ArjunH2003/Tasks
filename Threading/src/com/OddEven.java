package com;

public class OddEven {
	
	public synchronized void Even(int n ) {
		
		for(int i = 1;i <= 10;i++) {
			
			if(n % i == 0) {
				
				System.out.println(i);
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public synchronized void Odd(int n) {
		
		for(int i = 1;i <= 10;i++) {
			
			if(n % i != 0) {
				
				System.out.println(i);
				notify();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		OddEven n = new OddEven();
		
		new Thread() {
			
			public void run() {
				
				n.Even(1);
			}
		}.start();
		
		
		new Thread() {
			
			public void run() {
				
				n.Odd(5);
			}
		}.start();
		
		
	}

}
