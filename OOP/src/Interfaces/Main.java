package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        System.out.println("The new car contains following features: ");
        newCar.cc();
        newCar.mileage();
        newCar.typeOf();
        newCar.type();
        Engine.Price(); // static method are called via Interface name

        NewCar car = new NewCar();
        System.out.println("\nThe features of this class are: ");
        car.type();
        car.typeOf();

    }
}
