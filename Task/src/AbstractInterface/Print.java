package AbstractInterface;

import java.util.*;

interface Printable {
	
    void printInfo();
}

class Book implements Printable {
	
    String title;
    
    Book(String title){
    	
    	this.title = title; 
    	
    	}

    public void printInfo() {
    	
        System.out.println("Book: " + title);
    }
}

class Magazine implements Printable {
	
    String name;
    
    Magazine(String name){ 
    	
    	this.name = name; 
    	
    	}

    public void printInfo() {
    	
        System.out.println("Magazine: " + name);
    }
}

public class Print {
	
    public static void main(String[] args) {
    	
        List<Printable> items = new ArrayList<>();
        items.add(new Book("Java Basics"));
        items.add(new Magazine("Tech World"));

        for (Printable item : items) {
        	
            item.printInfo();
        }
    }
}
