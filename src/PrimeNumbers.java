import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int a = in.nextInt();

        System.out.println("This number is prime.");
        System.out.println(isPrime(a));

    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        else if(n%2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n%i == 0){
                return false;
            }
        }
    return true;
    }
}

