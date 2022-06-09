public class CountZero {
    public static void main(String[] args) {
        System.out.println(zero(10000010));
    }
    static int zero(int n) {
        int count = 0;
        if (n == 0) {
            return count;
        }
        int digit = n % 10;
        if (digit == 0) {
            count++;
        }
        return (count) + zero(n / 10);
    }
}
