import java.util.Scanner;

public class nKnights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the board: ");
        int n = in.nextInt();
        boolean[][] board = new boolean[n][n];

        knights(board, 0, 0, n);
    }

    static void knights(boolean[][] board, int row, int col, int target){
        if(target == 0){
            display(board);
            System.out.println();
            return;
        }
//        column goes out of bound
        if(row == board.length - 1 && col == board.length){
            return;
        }

//        what if it reaches the very end of the column ->> new row
        if(col == board.length){
            knights(board, row + 1, 0, target);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, target - 1);
            board[row][col] = false;
        }

        knights(board, row, col + 1, target);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if(isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if(isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if(isValid(board, row- 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

       return true;
    }
    static boolean isValid(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.print("K ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
