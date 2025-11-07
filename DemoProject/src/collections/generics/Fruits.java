package generics;

import java.util.ArrayList;

public class Fruits {

	    public static void main(String[] args) {
	        ArrayList<String> fruits = new ArrayList<String>();//give the class name
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Mango");

	        System.out.println("ArrayList: " + fruits);

	        fruits.remove("Banana");
	        System.out.println("After removal: " + fruits);
	        
	        for(String s:fruits) {
	        	System.out.println(s);
	        }
	}

}
