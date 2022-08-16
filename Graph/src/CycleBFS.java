// Cycle detection in undirected graph using BFS traversal

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CycleBFS {
    static boolean cycleInGraph(int s, int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(s, -1));
        vis[s] = true;

        while(!q.isEmpty()){
            int curr = q.peek().curr;
            int prev = q.peek().prev;
            q.remove();

           for(Integer node : adj.get(curr)){
               if(!vis[node]){
                   q.add(new Pair(node, curr));
                   vis[node] = true;
               }
               else if(prev != node) return true;
           }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        Arrays.fill(vis, false);

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                if(cycleInGraph(i, V, adj, vis)) return true;
            }
        }
        return false;
    }
}

class Pair{
    int curr;
    int prev;

    public Pair(int curr, int prev){
        curr = this.curr;
        prev = this.prev;
    }
}
