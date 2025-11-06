package AbstractInterface;

abstract class Vehicle {
	
    String name;
    
    Vehicle(String name){ 
    	
    	this.name = name; 
    }

    void startEngine() {
    	
        System.out.println(name + " engine started!");
    }

    abstract double calculateMaintenanceCost();
}

class Car extends Vehicle {
	
    Car(String name) {
    	super(name); 
    	}

    double calculateMaintenanceCost() {
        return 2000.0;
    }
}

class Truck extends Vehicle {
    Truck(String name) { 
    	super(name); 
    	}

    double calculateMaintenanceCost() {
        return 5000.0;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle c = new Car("Swift");
        Vehicle t = new Truck("Tata Truck");

        c.startEngine();
        System.out.println("Maintenance: Rs " + c.calculateMaintenanceCost());

        t.startEngine();
        System.out.println("Maintenance: Rs" + t.calculateMaintenanceCost());
    }
}
