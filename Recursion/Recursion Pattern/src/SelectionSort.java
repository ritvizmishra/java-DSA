import java.util.Arrays;
// complexity = O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,10,6,5,7,9,4,8};
        sort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end, int max){
        if(end == 0){
            return;
        }
        if(start < end) {
            if (arr[start] > arr[max]) {
                sort(arr, start + 1, end, start);
            } else {
                sort(arr, start + 1, end, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[end - 1];
            arr[end - 1] = temp;
            sort(arr, 0, end - 1, 0);
        }
    }
}
