import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int count = 1;
        System.out.print("Define your counts: ");
        int n = in.nextInt();

//        while(count <= n){
//            int c;
//            c = a +b;
//            System.out.print(+a +" ");
//            a = b;
//            b = c;
//            count++;
//        }

        for(count=1; count<=n; count++){
            int c;
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
