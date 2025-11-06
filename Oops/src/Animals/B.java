package Animals;

class A{
	
	A(){
		System.out.println("A class constructor");  // default constructor
		}
	
		A(int x){
			System.out.println("The value of x is "+x+" in A");
		}
		
	}
public class B extends A{
	
	B(){
		super(5);
		System.out.println("B class constructor");
		
	}
	
	B(int x){
		super(36);
		System.out.println("The value of x is "+x+" in B");
	}
	
	public static void main(String[] args) {
		//new B();  // default constructor in super class is always called
		//new B(22); 
		//new C();
		new C(8);
	}
	
	}
	
	class C extends B{
		
		C(){
			System.out.println("Default constructor of C");
		}
		
		C(int x){
			super(45);
			System.out.println("The number in C is "+x);
		}
	}
	
	
