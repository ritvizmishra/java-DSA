import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphBFS {
    static boolean bipartiteGraph(ArrayList<ArrayList<Integer>> adj, int n){
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i = 1; i <= n; i++){
            if(color[i] == -1){
                if(!ifBipartite(i, color, adj)) return false;
            }
        }
        return true;
    }

    private static boolean ifBipartite(int node, int[] color, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q= new LinkedList<>();
        q.add(node);
        color[node] = 1;

        while(!q.isEmpty()){
            Integer curr = q.poll();

            for(Integer next : adj.get(curr)){
                if(color[next] == -1){
                    q.add(next);
                    color[next] = 1 - color[curr];
                }
                else if(color[next] == color[curr]) return false;
            }
        }

        return true;
    }
}
