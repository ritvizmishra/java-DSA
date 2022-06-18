import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,6,7,9,10,8};
        sort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int i = start;
        int j = end;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while(j >= i) {
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(j >= i){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        sort(arr, start, j);
        sort(arr, i, end);
    }
}
