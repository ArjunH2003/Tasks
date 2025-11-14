package pack;

public class ThreadDemo extends Thread{

public static void main(String[] args) {

ThreadDemo th1=new ThreadDemo();//New Born 
ThreadDemo th2=new ThreadDemo();

	th1.start();//Runnable
	th2.start();
}

public void run()

{

for(int i=1;i<=5;i++)

{

System.out.println(i);

try {

Thread.sleep(3000);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

}