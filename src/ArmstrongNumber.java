import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

        System.out.println("Input three digit number: ");
      int a = in.nextInt();
        System.out.println(ArmsN(a));
    }
    static boolean ArmsN(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem  = n%10;
            int temp = rem*rem*rem;
            n = n/10;

            sum = sum + temp;

        }
   return sum == original;
    }
}
