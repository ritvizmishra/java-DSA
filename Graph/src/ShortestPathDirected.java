// Shortest path in directed weighted graph

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathDirected {
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(src, -1));
        vis[src] = true;

        while(!q.isEmpty()){
            int node = q.peek().V;
            int par = q.peek().N;

            q.remove();

            for(Integer it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                } else if (par != it) return true;
            }
        }
        return false;
    }

    static  boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        Arrays.fill(vis, false);

         for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(checkForCycle(adj, i, vis)) return true;
            }
        }
        return false;
    }
}

class Node{
    int V;
    int N;

    Node(int V, int N){
        this.V = V;
        this.N = N;
    }
}
