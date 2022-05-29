public class InfiniteArray {
    static int range(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
//            double the box size
            end = end + (end - start +1) * 2;
            start = newStart; //did not update before as was used in end case
        }
        return findPosition( arr, target, start, end);
    }
    static int findPosition(int[] arr, int target, int start, int end){

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
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170, 180, 190, 200, 210, 220, 240, 260, 280, 300, 320, 340, 360, 380, 400};
        int target = 160;
        System.out.println(range(arr, target));
    }
}
