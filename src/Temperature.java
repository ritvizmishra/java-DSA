import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is temperature convertor!");

        System.out.print("Enter current temperature in Celsius: ");
        double temp = input.nextDouble();

        double ctemp = (temp * 1.8) + 32;
        System.out.println("This temperature converted to Fahrenheit is: " +ctemp + "°F");
    }
}