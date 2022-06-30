public class ClassObject {
    public static void main(String[] args){

        Student[] students = new Student[5];
        Student student1 = new Student(128, "Ritviz Mishra", 87.2f);
         Student student2 = new Student(103, "Suryansh Shahi", 89.3f);

        student1.greetings();
        System.out.println();

//        System.out.println(student1.rollNum = 128);
//        student1.name = "Ritviz Mishra";
//        student1.marks = 88.8f;
//        System.out.println(student1.marks);

        System.out.println(student1.rollNum + " " + student1.name + " " + student1.marks);
        System.out.println(student2.rollNum + " " + student2.name + " " + student2.marks);

        Student student3 = new Student();
        System.out.println(student3.rollNum + " " + student3.name + " " + student3.marks);

//        memory allocation of new keyword
        Student one = new Student();
        Student two = one;
        one.name = "A lost soul";
        System.out.println();
        System.out.println(two.name);


    }

//    class
    static class Student{
        int rollNum;
        String name;
        float marks;

//        function inside a class
        void greetings(){
            System.out.println("Hello! My name is " + name);
        }

//        constructor
//        Student(){
//            this.rollNum = 128;
//            this.name = "Ritviz Mishra";
//            this.marks = 87.7f;
//        }

//    calling constructor from another constructor
        Student(){
            this (0, "Default", 100.0f);
        }

//        main constructor
        Student(int rollNum, String name, float marks){
            this.rollNum = rollNum;
            this.name = name;
            this.marks = marks;
        }

    }

//    garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object are destroyed.");
    }
}
