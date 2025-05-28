public class Main {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
//        outer loop is for rows
        for(int row = 0; row <= n; row++){
            for(int i = n - row; i >= 1; i--){
                System.out.print(" ");
            }
//            inner loop is for column and type of element.
            for(int col = 1; col <= row; col++){
                System.out.print("* "); //what do you need to print
            }
            System.out.println(); //when each row is printed add new line
        }
    }
}
