import java.util.ArrayList;

public class MoveDiagonal {
    public static void main(String[] args) {
        System.out.println(paths("", 3, 3));
    }

    static ArrayList<String> paths(String processed, int row, int col){
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(paths(processed + "d", row - 1, col - 1));
        }
        if(row > 1){
            list.addAll(paths(processed + "R", row - 1, col));
        }
        if(col > 1){
            list.addAll(paths(processed + "D", row, col - 1));
        }

        return list;
    }
}
