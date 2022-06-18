import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6,5,7,9,10,8};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        
        int i = 0; // pointing to the left array
        int j = 0; // pointing to the right array
        int k = 0; // pointing to the mixed (new) array.

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        // if some elements in left or right array are left after comparison.
        while(i < left.length){ // if left in left array
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){ // if left in right array
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
