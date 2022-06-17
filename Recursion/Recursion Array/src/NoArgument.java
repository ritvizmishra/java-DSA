import java.util.ArrayList;

public class NoArgument {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7,4};
        System.out.println(ls(arr, 0, 4));
    }
    static ArrayList<Integer> ls(int[] arr, int i, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> solution = ls(arr, i+1, target);
        list.addAll(solution);
        return list;
    }
}
