import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUndirected {
    static void shortestPath(ArrayList<ArrayList<Integer>> adj, int n, int src){
        int[] dist = new int[n];
        Arrays.fill(dist, (int)Math.pow(10, 9));

        Queue<Integer> q= new LinkedList<>();

        dist[src] = 0;
        q.add(src);

        while(!q.isEmpty()){
            int node = q.poll();

            for(Integer i : adj.get(node)){
                if(dist[node] + 1 < dist[i]) dist[i] = dist[node] + 1;
                q.add(i);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(dist[i] + " ");
        }
    }
}
