import java.util.Arrays;
import java.util.Scanner;

public class FibRec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);  // Step 0
        System.out.println(f(n, dp));
    }

    static int f(int n, int[] dp){
        if(n <= 1) return n;

        if(dp[n] != -1) return dp[n]; // Step 1
        return dp[n] = f(n - 1, dp) + f(n - 2, dp); // Step 2
    }
}
