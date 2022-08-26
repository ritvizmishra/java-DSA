// Topological sorting

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalDFS {
    static int[] topoSort(int n, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stack = new Stack<>();
        int[] vis = new int[n];

        for(int i = 0; i < n; i++){
            if(vis[i] == 0){
                findTopoSort(i, vis, adj, stack);
            }
        }

        int[] topo = new int[n];
        int i = 0;
        while(!stack.isEmpty()){
            topo[i++] = stack.pop();
        }
        return topo;
    }

    private static void findTopoSort(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack) {
        vis[node] = 1;
        for(Integer i : adj.get(node)){
            if(vis[i] == 0){
                findTopoSort(i, vis, adj, stack);
            }
        }
        stack.push(node);
    }
}
