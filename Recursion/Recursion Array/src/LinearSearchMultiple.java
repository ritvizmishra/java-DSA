import java.util.ArrayList;

public class LinearSearchMultiple {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,9,10};
        ls(arr, 0, 5);
        System.out.println(list);
    }
    static  ArrayList<Integer> list = new ArrayList<>();
    static void ls(int[] arr, int i, int target){
        if(i == arr.length){
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ls(arr, i+1, target);
    }
}

