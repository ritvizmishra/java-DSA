public class BinarySearch {
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
     int[] arr = {-33, -22, -11, 0, 11, 22, 33, 44, 55, 66, 77, 88, 99};
     int target = -33;
        System.out.println(binary(arr, target));
    }
}
