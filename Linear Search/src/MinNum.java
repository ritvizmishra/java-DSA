public class MinNum {
    static void minum(int[] arr, int min){
        min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -8, 4, 5 , -6};
        int min =  arr[0];

        minum(arr, min);

    }
}
