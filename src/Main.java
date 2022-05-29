import java.util.Arrays;
import java.util.Scanner;

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