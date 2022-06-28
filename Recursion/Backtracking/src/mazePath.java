import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        System.out.println(paths("", 4, 4));
    }

    static ArrayList<String> paths(String processed, int row, int col){
        if(row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(col > 1) {
            list.addAll(paths(processed + "R", row, col - 1));
        }

        if(row > 1) {
            list.addAll(paths(processed + "D", row - 1, col));
        }
        return list;
    }
}
