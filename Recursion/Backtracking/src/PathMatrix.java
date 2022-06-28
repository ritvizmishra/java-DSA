import java.util.Arrays;

public class PathMatrix {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[maze.length][maze[0].length];
        paths("", maze, 0, 0, path, 1);
    }
    static void paths(String processed, boolean[][] maze, int row, int col, int[][] path, int steps){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            path[row][col] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        path[row][col] = steps;

        if(row < maze.length - 1){
            paths(processed + "D", maze, row + 1, col, path, steps + 1);
        }
        if(row > 0){
            paths(processed + "U", maze, row - 1, col, path, steps + 1);
        }
        if(col < maze[0].length - 1){
            paths(processed + "R", maze, row, col + 1, path, steps + 1);
        }
        if(col > 0){
            paths(processed + "L", maze, row, col - 1, path, steps + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
