import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter you favorite fruit: ");
//        String fruits = in.next();
//        switch (fruits) {
//            case "mango" -> System.out.println("King of fruits, yes it is.");
//            case "banana" -> System.out.println("That's the dumbest fruit.");
//            case "apple" -> System.out.println("Okay, whatever.");
//            default -> System.out.println("Shut Up you bitch!");
//            }
        System.out.print("Enter the days of the week you want name of: ");
            String day = in.next();
        switch (day) {

            case "weekdays":
                System.out.println("Monday");

            case "3":
                System.out.println("Tuesday");

            case "4":
                System.out.println("Wednesday");

            case "5":
                System.out.println("Thursday");

            case "6":
                System.out.println("Friday");
                break;

            case "weekends":
                System.out.println("Saturday");

            case "1":
                System.out.println("Sunday");
                break;
        }

    }
}
