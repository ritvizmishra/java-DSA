import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int getMax = getMaxIndex(arr, 0, last);
            swap(arr, getMax, last);
        }
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i < end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
