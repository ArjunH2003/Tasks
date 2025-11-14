package com.example;

public class Tiger {
//	Tiger(int x){
//		
//	}
//	
	
	public static void tigerEat() {
		
		System.out.println("Eats only non veg! ");
		
	}
	public static void main(String[] args) {
//		Tiger t = new Tiger();
//		Animal a = t:: Tiger()
//		
//		Animal a = Tiger::new;
//		a.eat(5);
		Animal a = Tiger::tigerEat;
		a.eat();
	}

}
