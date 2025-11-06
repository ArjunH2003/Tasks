package pack2;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Eats only non-veg");
		
	}

	@Override
	public void run() {
		System.out.println("Runs fast");
		
	}
	
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.run();
		t.eat();
		System.out.println(Animal.legs);
	}
	

}
