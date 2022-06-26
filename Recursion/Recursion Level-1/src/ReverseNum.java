public class ReverseNum {
    public static void main(String[] args) {
        reverse1(7326);
        System.out.println(sum);
        System.out.println(reverse2(7326));
        reverse3(7326);
    }
//    Method 1:
    static int sum = 0;
    static void reverse1(int n){
        if(n == 0){
            return ;
        }
        int digit = n % 10;
        sum = sum * 10 + digit;
        reverse1(n/10) ;
    }

//  Method 2:
    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int arg){
        if(n % 10 == n){
            return n;
        }
        int digit = n % 10;
        return digit * (int)(Math.pow(10, arg-1)) + helper(n/10, arg - 1);
    }

//    Method 3
    static void reverse3(int n){
        if(n % 10 == 0){
            return;
        }
        int digits = n % 10;
        System.out.print(digits);
        reverse3(n / 10);
    }
}
