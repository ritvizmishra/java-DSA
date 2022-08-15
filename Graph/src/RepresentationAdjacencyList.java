import java.util.ArrayList;

public class RepresentationAdjacencyList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 3; int m = 3;

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

//        1-->2
        adj.get(1).add(2);
        adj.get(2).add(1);

//        2-->3
        adj.get(2).add(3);
        adj.get(3).add(2);

//        3-->1
        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
        }
        System.out.println();
    }
}
