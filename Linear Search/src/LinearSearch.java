import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(ArrayList<Integer> arr, int target){
        if(arr.size() == 0){
            return -1;
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your array: ");
        ArrayList<Integer> arr = new ArrayList<>(5);
        while(in.hasNextInt()){
            int n = in.nextInt();
            arr.add(n);
            if(n == -9009){
                break;
            }
        }

        System.out.println("What is your target? ");
        int target = in.nextInt();

        int n = linearSearch(arr, target);
        System.out.println("Your target is at index :" + n);
    }
}
