import java.util.Arrays;

public class SearchIn2DArray {
    static int[] TwoDArray(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2, 32, 321},
                {23, 32, 1, 5, 4},
                {9, 7},
                {2, 67},
        };

        int target = 67;
        int[] n = TwoDArray(arr, target); // as I have to return an array
        System.out.println(Arrays.toString(n));
    }
}
