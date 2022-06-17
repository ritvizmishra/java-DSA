public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 2));
    }
    static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return binarySearch(arr, start, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, end, target);
        }
        if(target >= arr[mid] && target <= arr[end]){
            return binarySearch(arr, mid + 1, end, target);
        }
        return binarySearch(arr, start, mid - 1, target);
    }
}
