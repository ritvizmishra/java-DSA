import java.util.*;

public class HashMapMain {
    public static void main(String[] args){

//        find subarray with given sum
        int start = 0;
        int end = -1;
        int curSum = 0;
        int sum = 5;
        int[] arr = new int[]{10,15,-5,15,-10,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];

            if(curSum == sum){
                end = i;
                break;
            }
            if(map.containsKey(curSum - sum)){
                start = map.get(curSum - sum) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        if(end == -1) System.out.println("not found");
        else System.out.println(start + " " + end);
    }
}
