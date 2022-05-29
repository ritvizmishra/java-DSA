public class OrderAgnosticBS {
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
        int[] arr = {99, 88, 77, 66, 55, 44, 33, 22, 11, 0};
        int target = 11;
            System.out.println(orderAgnostic(arr, target));
    }
}

