
//Create a TransportVehicle class with model name and operational status, and a startEngine() method.

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

class Bike extends Vehicle {
    Bike(String name) { 
    	super(name); 
    	}

    double calculateMaintenanceCost() {
        return 5000.0;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle c = new Car("Swift");
        Vehicle t = new Bike("Royal Enfield");

        c.startEngine();
        System.out.println("Maintenance: Rs " + c.calculateMaintenanceCost());

        t.startEngine();
        System.out.println("Maintenance: Rs" + t.calculateMaintenanceCost());
    }
}