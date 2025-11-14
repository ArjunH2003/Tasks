
//Implement a class that converts temperature from degree celsius to fahrenheit.

package Encapsulation;

class TemperatureConverter {
    private double celsius;

    public void setCelsius(double c) { this.celsius = c; }
    public double getCelsius() { return celsius; }

    public double toFahrenheit() { return (celsius * 9/5) + 32; }
}

public class TempConvert {
    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        t.setCelsius(25);
        System.out.println("Fahrenheit: " + t.toFahrenheit());
    }
}
