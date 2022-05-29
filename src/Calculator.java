import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ans;
        while(true){
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.print("Enter the first number: ");
                double a = input.nextDouble();
                System.out.print("Enter the second number: ");
                double b = input.nextDouble();

                if(op == '+'){
                    ans = a + b;
                    System.out.println("Your answer is: " +ans);
                }
                if(op == '-'){
                    ans = a - b;
                    System.out.println("Your answer is: " +ans);
                }
                if(op == '*'){
                    ans = a * b;
                    System.out.println("Your answer is: " +ans);
                }
                if(op == '/'){
                    if(b != 0) {
                        ans = a / b;
                        System.out.println("Your answer is: " +ans);
                    } else {
                        System.out.println("Error!");
                    }
                }
            }else if(op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("Invalid input!");
            }
        }
    }
}
