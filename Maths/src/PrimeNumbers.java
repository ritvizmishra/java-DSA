public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 37;
        for(int i = 2; i <= n; i++){
            if(isPrime(i))
            System.out.print(i + " ");
        }
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
