package Interfaces;

public class NewCar {
    private Gear gear;
    private Color color = new NewColor();

    public NewCar(){
        gear = new NewGear();

    }

    public void type(){
        gear.type();
    }

    public void typeOf(){
        color.type();
    }
}
