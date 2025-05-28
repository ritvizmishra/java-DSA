package Principles.Inheritance;

public class Box {
        double length;
        double width;
        double height;

//        initial
        Box(){
            this.length = -1;
            this.width = -1;
            this.height = -1;

        }

//        cube
        Box(double size){
            this.length = size;
            this.width = size;
            this.height = size;
        }

//        standard
        Box(double length, double width, double height){
            this.length = length;
            this.width = width;
            this.height = height;
        }

//        copy constructor
        Box(Box old){
            this.length = old.length;
            this.width = old.width;
            this.height = old.height;
        }
}
