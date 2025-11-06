package pack.subpack;

import pack.Calc;

public class A extends Calc{
	
public static void main(String[] args) {
		
		Calc.add(22, 30);
		Calc c = new Calc();
		c.sub(18,9);
		System.out.println(c.mul(3,6));
		
		Calc.display(12,36);  // protected static method display() in class Calc()
		
		A a = new A();      // 	non static method hai() in class Calc()
		a.hai(60, 600);
		
	}
}
