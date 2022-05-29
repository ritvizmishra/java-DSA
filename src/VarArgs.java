import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       varargs(1, 2, "Ritviz", "Mishra");

    }
    static void varargs(int a, int b, String...i){
        System.out.println(a + " " + b + " " + Arrays.toString(i));
    }
}
