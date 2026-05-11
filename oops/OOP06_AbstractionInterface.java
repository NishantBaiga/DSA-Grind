package oops;

// Abstract class
abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Concrete method
    void fuelType() {
        System.out.println("Petrol/Diesel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

// Interface
interface Payment {

    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment via UPI");
    }
}

public class OOP06_AbstractionInterface {

    public static void main(String[] args) {

        // Abstraction
        Vehicle v = new Car();

        v.start();
        v.fuelType();

        // Interface
        Payment p = new UPI();

        p.pay();
    }
}