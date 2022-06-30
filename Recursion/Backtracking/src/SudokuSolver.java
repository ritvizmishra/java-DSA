public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = {
                        {7, 0, 5, 0, 1, 0, 8, 0, 2},
                        {0, 4, 0, 9, 0, 3, 0, 6, 0},
                        {9, 0, 1, 0, 8, 0, 3, 0, 4},
                        {0, 8, 0, 3, 0, 9, 0, 5, 0},
                        {4, 0, 3, 0, 5, 0, 9, 0, 6},
                        {0, 7, 0, 1, 0, 6, 0, 3, 0},
                        {1, 0, 7, 0, 9, 0, 6, 0, 3},
                        {0, 9, 0, 7, 0, 8, 0, 1, 0},
                        {3, 0, 8, 0, 6, 0, 7, 0, 9}
        };

        if(solveSudoku(sudoku)){
            display(sudoku);
        }
        else{
            System.out.println("This sudoku can not be solved.");
        }

    }

    static boolean solveSudoku(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmpty = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;  //come out of that part as already found an empty
                }
            }
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
           return true;  // SOLVED
        }

        for(int num = 1; num <= board.length; num++){
            if(isSafe(board, row, col, num)) {
                board[row][col] = num;
                if(solveSudoku(board)){ // you inserted a number and it is correct then alright
                    return true;
                }
                else{ // but what if the number entered is not correct, then we have to reset it and start again
                    board[row][col] = 0;
                }
            }
        }
        return false; // can not be solved
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));

        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int i = rowStart; i < rowStart + sqrt; i++){
            for(int j = colStart; j < colStart + sqrt; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board){
        for(int[] row : board){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
