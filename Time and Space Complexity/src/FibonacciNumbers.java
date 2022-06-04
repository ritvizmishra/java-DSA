import java.util.Scanner;

public class FibonacciNumbers {
    static long fibo(int n){
      return (long)(((Math.pow(((1 + Math.sqrt(5))/2), n)) - (Math.pow(((1 - Math.sqrt(5))/2), n)))/ Math.sqrt(5));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
