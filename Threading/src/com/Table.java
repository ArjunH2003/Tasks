package com;

//public class Table {
//
//public void print(int x)
//
//{
//
//for(int i=1;i<=5;i++)
//
//{
//
//System.out.println(i*x);
//
//try {
//
//Thread.sleep(3000);
//
//} catch (InterruptedException e) {
//
//// TODO Auto-generated catch block
//
// e.printStackTrace();
//
//}
//
//}
//
//}
//
//}
//
//
//
//

public class Table {

//public synchronized void print(int x)    //method synchronization

public static synchronized void print(int x){

{
//synchronized(this) {                    // object level synchronization
for(int i=1;i<=5;i++)

{

System.out.println(i*x);

try {

Thread.sleep(3000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

 e.printStackTrace();

}

}

}

}
}



