import java.util.Scanner;

public class TriangleOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        triangle(row, 0);
    }
    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
           triangle(row, col + 1);
           System.out.print("☆");
        }else {
            triangle(row - 1, 0);
            System.out.println();
        }
    }
}
