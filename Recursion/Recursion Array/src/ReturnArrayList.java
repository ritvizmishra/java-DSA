import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3,4,4,4,5,6,2};
        System.out.println(ls(arr, 0, 4, list));
    }
    static ArrayList<Integer> ls(int[] arr, int i, int target, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return ls(arr, i+1, target, list);
    }
}
