package Principles.Polymorphism;

public class Circle extends Shape {

    @Override  //known as annotation, to check if the method is overriding or not
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
