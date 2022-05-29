public class FindInMountain {
    public static int elementInMountainArray(int[] arr, int target) {
        int max = max(arr);
        int firstTry = orderAgnostic(arr, target, 0, max);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr, target, max + 1, arr.length-1);
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
    static int orderAgnostic(int[] arr, int target, int start, int end){
        if (arr[0] < arr[end]) {
            while (start <= end) {
                int mid = start + ((end - start) / 2);
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = start + 1;
                } else {
                    return mid;
                }
            }
        }
        else if (arr[0] > arr[end]){
            while(start <= end){
                int mid = start + ((end - start) / 2);
                if(arr[mid] > target){
                    start = mid +1;
                }else if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(elementInMountainArray(arr, target));
    }
}
