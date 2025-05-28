package Interfaces;

public class Car implements Engine, Brake, Gear{

    @Override
    public void cc() {
        System.out.println("1500cc Engine");
    }

    @Override
    public void mileage() {
        System.out.println("20mpg Mileage");
    }

    @Override
    public void typeOf() {
        System.out.println("Drum Brakes");
    }

    @Override
    public void type() {
        System.out.println("Manual Transmission");
    }
}
