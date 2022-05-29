public class RotatedArray {
    public static int search(int[] arr, int target) {
        int max = max(arr);
        int firstTry = binary(arr, target, 0, max);
        if(firstTry != -1){
            return firstTry;
        }
        return binary(arr, target, max + 1, arr.length-1);
    }
    static int max(int[] nums){
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
    static int binary(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + ((end - start) / 2);
            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] < target){
                start = start + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
