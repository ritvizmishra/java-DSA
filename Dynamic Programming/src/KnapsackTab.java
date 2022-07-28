public class KnapsackTab {
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

         for(int i = wt[0]; i <= W; i++){
            dp[0][i] = val[0];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= W; j++) {
                int notPick = dp[i - 1][j];

                int pick = Integer.MIN_VALUE;
                if(wt[i] <= j) {
                    pick = val[i] + dp[i - 1][j - wt[i]];
                }
                dp[i][j] = Math.max(notPick, pick);
            }
        }
        return dp[n-1][W];
    }
}
