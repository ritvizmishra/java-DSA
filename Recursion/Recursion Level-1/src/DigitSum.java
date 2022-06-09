public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(3462));
    }
    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        int digit = n % 10;

        return  digit + digitSum(n/10) ;
    }
}
