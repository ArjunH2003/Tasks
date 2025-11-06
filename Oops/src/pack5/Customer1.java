package pack5;

public class Customer1 extends Hotel {
	
	public void CustomerInfo(String name) {
		
		System.out.println("Name of Customer : "+name);
	}
	
	public static void main(String[] args) {
		
		Customer1 c = new Customer1();
		c.CustomerInfo("John");
		c.ChickenBiriyani(200);
		c.Mutton(250);
		c.VegBiriyani(150);
		c.Idli(50);
		c.bill();
		System.out.println("-------------------------------------");
		Hotel h = new Customer1();
		h.ChickenBiriyani(200);
		h.Mutton(250);
		h.VegBiriyani(150);
		h.Idli(50);
		System.out.println("--------------------------------------");
		Veg v = new Customer1();
		v.VegBiriyani(150);
		v.Idli(50);
		System.out.println("--------------------------------------");
		NonVeg nv = new Customer1();
		nv.ChickenBiriyani(200);
		nv.Mutton(250);
		
		
		
		
		
		
	}

}
