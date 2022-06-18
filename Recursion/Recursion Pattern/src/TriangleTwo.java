import java.util.Scanner;

public class TriangleTwo {
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
            System.out.print("☆");
            triangle(row, col + 1);
        }else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }
}
