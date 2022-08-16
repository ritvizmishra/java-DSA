import java.util.ArrayList;

public class DFS {
    public static void dfs(int V, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs){
        storeDfs.add(V);
        vis[V] = true;

        for(Integer node : adj.get(V)){
            if(!vis[node]){
                dfs(node, vis, adj, storeDfs);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> storeDfs = new ArrayList<>();
        boolean[] vis = new boolean[V+1];

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                dfs(i, vis, adj, storeDfs);
            }
        }
        return storeDfs;
    }
}
