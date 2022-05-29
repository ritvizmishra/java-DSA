//public class SearchRange {
//    static int LS(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for(int i = 1; i < 4; i++){
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5 , 6};
//        int target = 4;
//
//        System.out.println(LS(arr, target));
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

public class SearchRange {
    static int linearSearch(ArrayList<Integer> arr, int target){
        if(arr.size() == 0){
            return -1;
        }
        for(int i = 1; i < 4; i++){
            if(arr.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your array: ");
        ArrayList<Integer> arr = new ArrayList<>(5);
        while(in.hasNextInt()){
            int n = in.nextInt();
            arr.add(n);
            if(n == -9009){
                break;
            }
        }

        System.out.println("What is your target? ");
        int target = in.nextInt();

        int n = linearSearch(arr, target);
        System.out.println("Your target is at index :" + n);
    }
}
