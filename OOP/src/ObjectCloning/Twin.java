package ObjectCloning;

public class Twin {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human ritviz = new Human(21, "Ritviz Misra");

        Human twin = (Human)ritviz.clone();
        System.out.println(twin.age + " " + twin.name);

    }

}
