package AccessControl;

public class Main {
    public static void main(String[] args) {
        Access obj = new Access(5, "Ritviz Mishra");
//        private
        System.out.println(obj.getNum() + " " + obj.str + " " + obj.arr);

        System.out.println(obj instanceof Access);

        System.out.println(obj.getClass().getName());

    }
}
