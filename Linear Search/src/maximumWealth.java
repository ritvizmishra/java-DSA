public class maximumWealth {
    static
    static int maximumWealth(int[][] accounts){
        int max = sum(accounts[0]);
        for(int i = 0; i < accounts.length; i++){
            if(max < sum(accounts[i])){
                max = sum(accounts[i]);
            }
        }int sum(int[] row){
            int s = 0;
            for(int i = 0; i < row.length; i++){
                s = s + row[i];
            }
            return s;
        }
        return max;
    }
    public static void main(String[] args) {
     int[][] arr = {
             {1,5},
             {7,3},
             {3,5}
     };
        System.out.println(maximumWealth(arr));
    }
}
