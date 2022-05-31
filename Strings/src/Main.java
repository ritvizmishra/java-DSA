import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String name = "Ritviz";
        String Name = new String("Ritviz");

//        .equals() -- used to compare two values.
        System.out.println(name +" "+ Name);

//        charAt() -- returns character at that index.
        System.out.println(name.charAt(0));

//        wrapper class -- provides way to use primitives as objects.
        Integer nums = new Integer(56);

//        .toString() -- method used to print objects & can be used on wrapper class as well.
        System.out.println(nums.toString());

//        Formatted Output
        float a = 415.1234f;
        System.out.printf("Formatted Output is %.2f \n", a);

//        Print PIE till 3 digits of decimal
        System.out.printf("PIE is %.3f \n", Math.PI);

//        Order of placeholders == order of elements
        System.out.printf("My name is %s and I am %s \n", "Ritviz", "21");

        /* There are many format specifiers we can use. Here are some common ones:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline

         */

//        String Concatenation
        System.out.println("a" + 1); // here, 1 is converted to its wrapper class (Integer), which will call toString().

//        String Methods
        System.out.println(Arrays.toString(name.toCharArray())); // .toCharArray()
        System.out.println(name.toLowerCase()); // .toLowerCase()
        System.out.println(name.indexOf('i')); // .indexOf()
        System.out.println("        Ritviz            ".strip()); // .strip()
    }
}
