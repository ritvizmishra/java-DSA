import java.util.ArrayList;

public class CycleDirected {
    static boolean cycleCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] dfsVis, int[] vis){
        vis[node] = 1;
        dfsVis[node] = 1;

        for(Integer i : adj.get(node)){
            if(vis[i] == 0){
                if(cycleCheck(i, adj, dfsVis, vis)) return true;
            }
            else if(dfsVis[i] == 1) return true;
        }
        dfsVis[node] = 0;
        return false;
    }

    boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[n];
        int[] dfsVis = new int[n];

        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                if(cycleCheck(i, adj, dfsVis, vis)) return true;
            }
        }
        return false;
    }
}
