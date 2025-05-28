package Static;

public class InnerClasses {
//    outer classes cannot be static
        public static void main(String[] args) {
            Ritviz info = new Ritviz(21, "Ritviz Mishra");
            System.out.println(info.age + " " + info.name);

        }

    static class Ritviz{
//        inner classes can be static

        int age;
        String name;

       public Ritviz(int age, String name){
           this.age = age;
           this.name = name;
       }
    }
}
