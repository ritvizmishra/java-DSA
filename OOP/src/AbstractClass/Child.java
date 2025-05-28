package AbstractClass;

public class Child extends Parent {

    @Override
    void career(){
        String choice = "IFS";
        System.out.println("I want to be " + choice + " officer.");
    }

    @Override
    void partner(){
        String name = "Indumati";
        int age = 28;
        System.out.println("I love " + name + ". " + "and, her age is " + age + ".");
    }

//    you cannot directly implement parent class objects in other classes.
    Parent parent = new Parent() {
        @Override
        void career() {

        }

        @Override
        void partner() {

        }
    };


}
