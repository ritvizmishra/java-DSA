public class AllPaths {
    public static void main(String[] args){
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        paths("", maze, 0, 0);
    }
    static void paths(String processed, boolean[][] maze, int row, int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(processed);
            return;
        }
        if(!maze[row][col]){  // if already visited
            return;
        }

        maze[row][col] = false;  // visited

        if(row < maze.length - 1) {
            paths(processed + "Down ", maze, row + 1, col);
        }
        if(col < maze[0].length - 1){
            paths(processed + "Right ", maze, row, col + 1);
        }
        if(row > 0){
            paths(processed + "Up ", maze, row - 1, col);
        }
        if(col > 0){
            paths(processed + "Left ", maze, row, col - 1);
        }

        maze[row][col] = true; // restoration
    }
}
