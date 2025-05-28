import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = in.nextDouble();
        System.out.print("Enter the second number: ");
        double b = in.nextDouble();
        System.out.print("Enter the third number: ");
        double c = in.nextDouble();

//        if(a>b && b>c){
//            System.out.println(a+" is the largest among three.");
//        }else if (a<b && b>c){
//            System.out.println(b+" is the largest among three.");
//        }else{
//            System.out.println(c+" is the largest among three.");
//        }

        //OR

        double max = Math.max(c,(Math.max(a,b)));
        System.out.println(max+ " is the largest among three.");
    }
}
