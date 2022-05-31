import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(palindrome(string));
        if(palindrome(string)){
            System.out.println(string+" is a palindrome.");
        }else {
            System.out.println(string + " is not a palindrome.");
        }
    }
    static boolean palindrome(String string){
        string = string.toLowerCase();
        for(int i = 0; i < string.length() / 2; i++){
            char start = string.charAt(0);
            char end = string.charAt(string.length() - 1);

            if(start == end){
                return true;
            }
        }
        return false;
    }
}
