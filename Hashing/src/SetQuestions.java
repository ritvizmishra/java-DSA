import java.util.HashSet;
import java.util.Set;

public class SetQuestions {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,4,5,7,6,8};
        System.out.println(countDistinct(arr, arr.length));
    }

    public static int countDistinct(int[] arr, int n){
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
