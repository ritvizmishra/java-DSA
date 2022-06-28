public class MazeRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        paths("", maze, 0, 0);
    }
    static void paths(String processed, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(processed);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        if(row < maze.length - 1){
            paths(processed + "D", maze,row + 1, col);
        }
        if(col < maze[0].length - 1){
            paths(processed + "R", maze, row, col + 1);
        }
    }
}
