package Principles.Inheritance;

import Principles.Inheritance.Box;

public class InheritanceMain {
    public static void main(String[] args) {
        Box boxOne = new Box();
        System.out.println(boxOne.width + " " + boxOne.height + " " + boxOne.length);

        Box boxTwo = new Box(4.2, 2.33, 2.56);
        System.out.println("\n" + boxTwo.width + " " + boxTwo.height + " " + boxTwo.length);

        BoxWeight boxThree = new BoxWeight();
        System.out.println("\n" + boxThree.width + " " + boxThree.height + " " + boxThree.length + " " + boxThree.weight);

        BoxWeight boxFour = new BoxWeight(5.23, 2.44, 2.22, 4.76);
        System.out.println("\n" + boxFour.width + " " + boxFour.height + " " + boxFour.length + " " + boxFour.weight);

        BoxWeight otherBox = new BoxWeight();
        BoxWeight boxFive = new BoxWeight(otherBox);
        System.out.println("\n" + boxFive.width + " " + boxFive.height + " " + boxFive.length + " " + boxFive.weight);

        BoxPrice boxSix = new BoxPrice(5.23, 2.44, 2.22, 4.76, 7.3);
        System.out.println("\n" + boxSix.width + " " + boxSix.height + " " + boxSix.length + " " + boxSix.weight + " " + boxSix.price);

        BoxColor boxSeven = new BoxColor(5.23, 2.44, 2.22, 4.76, "Black");
        System.out.println("\n" + boxSeven.width + " " + boxSeven.height + " " + boxSeven.length + " " + boxSeven.weight + " " + boxSeven.color);


    }

    public static class BoxWeight extends Box{
        double weight;

        public BoxWeight(){
            this.weight = -1;
        }

        public BoxWeight(double length, double width, double height, double weight) {
            super(length, width, height);
            this.weight = weight;
        }

        public BoxWeight (BoxWeight otherBox){
            super(otherBox);
            weight = otherBox.weight;
        }
    }

//    Single Inheritance
    public static class BoxPrice extends BoxWeight{
        double price;
        public BoxPrice(){
            super();
            this.price = -1;
        }

        public BoxPrice(BoxPrice other){
            super(other);
            this.price = other.price;
        }

        public BoxPrice(double length, double width, double height, double weight, double price){
            super(length, width, height, weight);
            this.price = price;
        }
    }

//    Hierarchical Inheritance
    public static class BoxColor extends BoxWeight{
        String color;

        public BoxColor(){
            super();
            this.color = "null";
        }

        public BoxColor(BoxColor other){
            super(other);
            this.color = other.color;
        }

        public BoxColor(double length, double width, double height, double weight, String color){
            super(length, width, height, weight);
            this.color = color;
        }
    }
}
