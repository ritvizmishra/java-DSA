import java.util.ArrayList;
import java.util.Arrays;

public class CycleDFS {
    static boolean cycleInGraph(int s, int p, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
         vis[s] = true;
         for(Integer node : adj.get(s)){
             if(!vis[node]){
                 if(cycleInGraph(node, s, vis, adj)) return true;
             }
             else if(node != p) return true;
         }
        return false;
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                if(cycleInGraph(i, -1, vis, adj)) return true;
            }
        }
        return false;
    }
}
