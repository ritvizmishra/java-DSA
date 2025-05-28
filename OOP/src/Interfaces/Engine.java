package Interfaces;

public interface Engine {

    static void Price(){
        int PRICE = 100000;  // already static and final
        System.out.println(PRICE);
    }

    void cc();
    void mileage();

}
