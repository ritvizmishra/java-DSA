import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,10,6,5,7,9,8};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end){
        if(end == 0){
            return;
        }
        if(start < end) {
            if (arr[start] > arr[start + 1]) {
                // swap
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
                // increment
            sort(arr, start + 1, end);
        }else {
            sort(arr, 0, end - 1); //because after one round, it needs to be checked again from 0th index.
        }
    }
}
