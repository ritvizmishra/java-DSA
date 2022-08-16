import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V+1];

        for(int i = 1; i <= V; i++){
            if(!vis[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while(!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);

                    for(Integer n : adj.get(node)){
                        if(!vis[n]){
                            q.add(n);
                            vis[n] = true;
                        }
                    }
                }
            }
        }
        return bfs;
    }
}
