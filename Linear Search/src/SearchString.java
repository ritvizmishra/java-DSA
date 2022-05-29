import java.util.Scanner;

public class SearchString {
    static boolean string(String str, char a) {
        if (str.length() == 0) {
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(a == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char a = in.next().charAt(0);

        System.out.println(string(str, a));
    }
}