public class MountainArray {

    static int peakIndexInMountainArray(int[] nums){
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int i = 0;
        while (i < nums.length) {

            if (nums[i] == max) {
                return i;
            }
           i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(nums));
    }
}
