public class Main {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int i) {
        if(i == 5){  // BASE CONDITION
            System.out.println(5);
            return;
        }
        System.out.println(i);
        print(i + 1);  // RECURSIVE CALL
    }
}
