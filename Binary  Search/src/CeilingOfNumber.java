public class CeilingOfNumber {
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length-1]){
            return -1;
        }
        while(start <= end){
            int mid = start + ((end - start)/ 2);
            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {-33, -22, -11, 0, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 100;
        System.out.println(ceiling(arr, target));
    }
}
