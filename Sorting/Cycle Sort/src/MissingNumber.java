public class MissingNumber {
    static int cyclic(int[] nums){
        int i = 0;
        while(i < nums.length){
            int n = nums[i];
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
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    public static void main(String[] args){
        int[] arr = {3,0,1};
        System.out.println(cyclic(arr));
    }
}
