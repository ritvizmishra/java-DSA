package Static;

public class StaticNonStatic {
    public static void main(String[] args) {

//        non static inside Static.a static
        StaticNonStatic gift = new StaticNonStatic();
        gift.cards();
    }
//    non static inside Static.a non static
    void cards(){
        greetings();
    }
//    non static
    void greetings(){
        System.out.println("Hey there!");
    }
}
