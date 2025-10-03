abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void start();

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

interface FuelEfficient {
    double calculateMileage();
}


class Car extends Vehicle implements FuelEfficient {
    int mileage;

    Car(String brand, int speed, int mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    void start() {
        System.out.println("Car Started...");
    }

    public double calculateMileage() {
        return mileage;
    }
}

class Bike extends Vehicle implements FuelEfficient {
    double mileage;

    Bike(String brand, int speed, double mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    void start() {
        System.out.println("Bike Started...");
    }

    public double calculateMileage() {
        return mileage;
    }
}

public class Lab3_1 {
    public static void main(String[] args) {
        Car car = new Car("Honda", 80, 18);
        car.displayInfo();
        car.start();
        System.out.println("Mileage: " + car.calculateMileage() + " km/l");
        System.out.println();

        Bike bike = new Bike("Yamaha", 60, 45);
        bike.displayInfo();
        bike.start();
        System.out.println("Mileage: " + bike.calculateMileage() + " km/l");
    }
}
