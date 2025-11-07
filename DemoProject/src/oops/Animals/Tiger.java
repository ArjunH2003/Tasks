package Animals;

public class Tiger extends Animal {
	
	void run() {
		System.out.println("Runs fast");
	}
	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.run();
		t.eat();
		System.out.println("Tiger has "+t.legs+" legs");
	}

}
