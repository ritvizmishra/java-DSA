public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,110};
        System.out.println(search(arr, 33, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end){ //to use start and end into recursive call, put in arguments

        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
