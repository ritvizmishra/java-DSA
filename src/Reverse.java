<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 3f01e033a9c4bdb1c96f44c49d7fc1ce1fbe1c80
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

            int a = 0;
            int b = arr.length - 1;
            while(b>a) {
                swap(arr, a, b);
                a++;
                b--;
            }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i1, int i2){
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;

=======
        Scanner input = new Scanner(System.in);

        System.out.print("The number you want to reverse: ");
        int n = input.nextInt();
        while(n > 0){
         int rem;
         rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
>>>>>>> 3f01e033a9c4bdb1c96f44c49d7fc1ce1fbe1c80
    }
}
