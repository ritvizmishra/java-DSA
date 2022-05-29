import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    //        INTEGER
        int[][] arr = new int[3][3];

//        INPUT
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

//        OUTPUT
        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

     //        DYNAMIC ARRAY

//        INPUT
            int[][] darr = {
                    {1, 2, 3},
                    {4, 5},
                    {4, 7, 8, 9}
            };

//        OUTPUT
        for(int row = 0; row < darr.length; row++){
            for(int col = 0; col < darr[row].length; col++){
                System.out.print(darr[row][col]+ " ");
            }
            System.out.println();
        }

    //        STRING
        String[][] str= new String[3][3];

//        INPUT
        for(int row = 0; row < str.length; row++){
            for(int col = 0; col < str[row].length; col++){
                str[row][col] = in.next();
            }
        }

//        OUTPUT
        for(int row = 0; row < str.length; row++){
            System.out.println(Arrays.toString(str[row]));
        }

    }
}
