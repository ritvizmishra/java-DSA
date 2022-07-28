import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int wt[] = {1,2,4,5};
        int val[] = {5,4,8,6};
        int W=5;

        int n = wt.length;

        System.out.println("The Maximum value of items, thief can steal is "+
                knapsack(n,W,wt,val));
    }

    static int knapsack(int n, int W, int[] wt, int[] val){
        int[][] dp = new int[n][W + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return f(n-1, W, wt, val, dp);
    }

    static int f(int n, int W, int[] wt, int[] val, int[][] dp){
        if(n == 0){
            if(wt[0] <= W) return val[0];
            else return 0;
        }
        if(dp[n][W] != -1) return dp[n][W];

        int notTake = f(n-1, W, wt, val, dp);
        int take = Integer.MIN_VALUE;
        if(wt[n] <= W){
            take = val[n] + f(n-1, W - wt[n], wt, val, dp);
        }

        return dp[n][W] = Math.max(notTake, take);
    }
}
