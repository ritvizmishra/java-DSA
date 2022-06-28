public class Maze{
    public static void main(String[] args){
        System.out.println(paths(4,2));
    }

    static int paths(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = paths(row - 1, col);
        int right = paths(row, col -1);

        return left + right;
    }
}
