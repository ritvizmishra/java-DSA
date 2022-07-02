package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Child childOne = new Child();
        childOne.career();
        childOne.partner();

        Parent childTwo = new Child();
        childTwo.career();
        childTwo.partner();
    }
}
