// Kahn's Algorithm

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalBFS {
    static int[] topoSort(int n, ArrayList<ArrayList<Integer>> adj){
        int[] topo = new int[n];
        int[] indegree = new int[n];

        for(int i = 0; i < n; i++){
            for(Integer it : adj.get(n)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0) q.add(i);
        }

        int i = 0;
        while(!q.isEmpty()){
            Integer node = q.poll();
            topo[i++] = node;

            for(Integer it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0) q.add(it);
            }
        }
        return topo;
    }
}
