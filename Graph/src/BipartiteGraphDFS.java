import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteGraphDFS {
    static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int n){
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(!dfsCheck(adj, i, color)) return false;
            }
        }
        return true;
    }

    private static boolean dfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int[] color) {
//        if(color[node] == -1) color[node] = 1;
        for(Integer n : adj.get(node)){
            if(color[n] == -1) color[n] = 1 - color[node];
            if(!dfsCheck(adj, n, color)) return false;
            else if(color[n] == color[node]) return false;
        }
        return true;
    }
}
