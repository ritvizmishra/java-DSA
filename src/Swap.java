import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        swap(arr, 1, 3 );
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }
}
