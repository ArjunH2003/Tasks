package com;


public class ThreadRunnable implements Runnable{


public static void main(String[] args) {

	ThreadRunnable rn=new ThreadRunnable();

Thread th1=new Thread(rn);

th1.start();

Thread th2=new Thread(rn);

th2.start();

}

@Override

	public void run() {

System.out.println("Runnable Object");

}


}