public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitProduct(3462));
    }
    static int digitProduct(int n){
        if(n % 10 == n){
            return n;
        }
        int digit = n % 10;

        return  digit * digitProduct(n/10) ;
    }
}
