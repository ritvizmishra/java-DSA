package Generics.LambaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr.add(i + 1);
        }

//      using forEach
        arr.forEach((item) -> System.out.println(item * 2));

//      using consumer type
        Consumer<Integer> func = (item) -> System.out.println((int)Math.pow(item, 2));
        arr.forEach(func);

//      multiple parameter
        Operator sum = (a, b) -> (a + b);
        Operator minus = (a, b) -> (a - b);
        Operator multiply = (a, b) -> (a * b);
        Operator divide = (a, b) -> (a / b);

        Lambda operation = new Lambda();
        System.out.println(operation.operate(5, 3, sum));
        System.out.println(operation.operate(5, 3, minus));
        System.out.println(operation.operate(5, 3, multiply));
        System.out.println(operation.operate(5, 3, divide));


    }
    private int operate(int a, int b,  Operator op){
        return op.operator(a, b);
    }

    interface Operator{
        int operator(int a, int b);
    }


}
