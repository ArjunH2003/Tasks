package com;
public class T1 extends Thread{

Table t;

T1(Table t)

{

this.t=t;

}

public void run()

{

t.print(1000);

}

}