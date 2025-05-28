package Static.a;
import static Static.b.Hello.greetings;
import static Static.b.Message.message;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, this is Ritviz.");

        greetings();
        message();
    }
}
