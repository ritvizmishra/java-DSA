public class FirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans = new int[]{start, end};
        return ans;
    }
    static int search(int[] nums, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + ((end - start)/ 2);
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findStart){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
       return ans;
    }
}
