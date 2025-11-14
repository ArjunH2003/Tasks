package com.example;


public class democ10 {

public static int arr[]=new int[5];

public static void div(int x,int y)

{

arr[0]=22;

arr[1]=33;


try

 {

 System.out.println("Division of "+x+" / "+y+" is "+(x/y));

arr[11]=77;

}

catch(ArithmeticException e)

{

System.err.println("Please enter non zero value "+e);

}

catch(ArrayIndexOutOfBoundsException aioob)

{

aioob.printStackTrace();

}

}

public static void main(String[] args) {

int x=22;

int y=1;

System.out.println("Welcome to Division Program");

democ10.div(x,y);

System.out.println("Bye...");

}

}