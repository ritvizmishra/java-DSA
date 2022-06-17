public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ls(arr, 0, 5));
    }
    static int ls(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return ls(arr, i+1, target);
    }
}
