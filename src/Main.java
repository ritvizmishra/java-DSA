import java.util.Arrays;
import java.util.Scanner;

<<<<<<< HEAD
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

//        input using for loops
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//            System.out.print(arr[i] + " ");
//        }
//        inout using for each
        /* for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int j : arr){
            System.out.print(j +" ");
        }

         */
//        input using Array.toString(arr);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        String[] str = {"Shubh", "Mishra", "studies", " at GBU"};
        change(str);
        System.out.println(Arrays.toString(str));

    }
    static void change (String[] a){
        a[0] = "Ritviz";
    }
}
=======
class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();

        twoSum(nums, target);
    }
    public static void twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(i <= target){
                for(int j = 1; j < nums.length - 1; j++){
                    if(nums[i] + nums[j] == target){
                        System.out.println("[" + i +", " + j + "]");
                    }
                }
            }
        }
    }
}
>>>>>>> 3f01e033a9c4bdb1c96f44c49d7fc1ce1fbe1c80
