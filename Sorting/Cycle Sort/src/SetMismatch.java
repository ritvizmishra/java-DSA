import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int n = nums[i] - 1;
            if(nums[i] != nums[n]){
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[] arr = {3,2,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
