import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = in.nextInt();
        int ans = sum(n1, n2);
        System.out.println("Sum is: " + ans);

        System.out.println("What is your name? ");
        String Name = in.next();
        System.out.println("My name is " + name(Name));

    }
    public static int sum (int a, int b){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter 1st number: ");
//        int a = in.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int b = in.nextInt();
         int c = a + b;
         return c;
    }
    public static String name(String myName){
//        Scanner in = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String myName = in.next();
        return myName;
    }
}
