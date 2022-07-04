package ExceptionalHandling;

public class Main {
    public static void main(String[] args) {
        int a = 33;
        int b = 0;

        try{
           divide(a, b);

           String str = "Ritviz";
           if(str.equals("Ritviz")) {
               throw new MyException("name is Ritviz");
           }

        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("over");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("do not divide by 0");
        };
        return a/b;
    }
}
