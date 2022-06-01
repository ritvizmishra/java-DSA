import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of fibonacci numbers you want: ");
        int n = in.nextInt();

        System.out.print("Here's your answer: ");
        for(int i = 0; i <= n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}                   
