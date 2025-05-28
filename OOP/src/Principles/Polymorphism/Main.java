package Principles.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
