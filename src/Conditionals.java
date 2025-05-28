import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // IF
        System.out.print("What is your salary? ");
        int salary = input.nextInt();
        if(salary > 30000){
            System.out.println("Salary is greater than 30,000/-");
            salary = salary + 2000;
        } else {
            System.out.println("Salary is less than 30,000/-");
            salary = salary + 1000;
        }
        System.out.println(salary);

        //FOR
        int a;
        for(a=1; a<=7; a++){
            //System.out.print(a +" ");
            System.out.println(a+". Ritviz Mishra");
        }

        //WHILE
        int b = 0;
        while(b!=16){
            System.out.print(b +" ");
            b++;
        }

        //DO WHILE
        int c = 1;
        do{
            System.out.println(c +". Bebo");
            c++;
        } while(c <= 10);

    }
}
