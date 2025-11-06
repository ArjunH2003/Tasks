package Animals;

public class Monkey extends Tiger {
	
	void eat() {
		
		super.eat();
		System.out.println("Eats Bananas");
		
	}
	public static void main(String[] args) {
		Monkey m = new Monkey();
		m.eat();
	}

}
