class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void drive() {
        System.out.println(brand + " car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    public void ride() {
        System.out.println(brand + " bike is riding.");
    }
}

public class oopsAss3ques3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.start();
        car.drive();

        Bike bike = new Bike("Yamaha");
        bike.start();
        bike.ride();
    }
}