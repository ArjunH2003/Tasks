package pack2;

public class Peacock implements Animal,Bird {

	@Override
	public void eat() {
		System.out.println("Eats insects");
		
	}

	@Override
	public void run() {
		System.out.println("Runs fast");
		
	}
	public static void main(String[] args) {
		
		Peacock p = new Peacock();
		p.eat();
		p.run();
		System.out.println(Animal.legs);
	}
	
	

}
