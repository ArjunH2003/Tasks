//Create a Vehicle abstract class and Payable interface.Implement Car (non-flyable) and Plane (flyable & payable).

package AbstractInterface;

interface Payable {
    void pay();
}

abstract class VehicleBase {
    abstract void startEngine();
}

class Car2 extends VehicleBase {
    void startEngine() {
        System.out.println("Car started!");
    }
}

class Plane extends VehicleBase implements Payable {
    void startEngine() {
        System.out.println("Plane engines started!");
    }

    public void pay() {
        System.out.println("Flight fuel paid!");
    }
}

public class VehiclePay {
    public static void main(String[] args) {
        Car2 car = new Car2();
        Plane plane = new Plane();

        car.startEngine();
        plane.startEngine();
        plane.pay();
    }
}
