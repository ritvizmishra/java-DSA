import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The number you want to reverse: ");
        int n = input.nextInt();
        while(n > 0){
         int rem;
         rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
    }
}
