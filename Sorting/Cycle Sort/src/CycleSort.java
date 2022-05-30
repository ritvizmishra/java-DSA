import java.util.Arrays;

public class CycleSort {
    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
