
//Create a class TransportVehicle with modelName and isOperational. Add startEngine() that turns the vehicle operational.

package Inheritence;

class TransportVehicle {
    String modelName;
    boolean isOperational;

    TransportVehicle(String modelName) {
        this.modelName = modelName;
        this.isOperational = false;
    }

    void startEngine() {
        if (!isOperational) {
            isOperational = true;
            System.out.println(modelName + " engine started.");
        } else {
            System.out.println(modelName + " is already running.");
        }
    }
}

public class Transport {
    public static void main(String[] args) {
        TransportVehicle car = new TransportVehicle("Tesla Model 3");
        car.startEngine();
        car.startEngine();
    }
}