package AbstractPackage;

public class Driver extends Car {
	
	public void start() {
		System.out.println("Start the car!");
	}
	
	public void Brand() {
		super.Brand();   //declare Brand() in Car final to avoid overriding
		System.out.println("Brand is Toyota");
		
	}

	@Override
	public void Carname() {
		System.out.println("Carname : Jazz");
		
	}
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		d.Color();
		d.Brand();
		d.Carname();
		d.start();
	}

}
