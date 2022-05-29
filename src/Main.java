import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

//        input using for loops
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//            System.out.print(arr[i] + " ");
//        }
//        inout using for each
        /* for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int j : arr){
            System.out.print(j +" ");
        }

         */
//        input using Array.toString(arr);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        String[] str = {"Shubh", "Mishra", "studies", " at GBU"};
        change(str);
        System.out.println(Arrays.toString(str));

    }
    static void change (String[] a){
        a[0] = "Ritviz";
    }
}
