public class Duplicate {
    static int cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            int n = nums[i] - 1;
            if(nums[i] < nums.length && nums[i] != nums[n]){
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
                return nums[index];
            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        int[] arr = {3,1,3,4,2};
        System.out.println(cyclic(arr));
    }
}