import java.util.ArrayList;

public class PrimsAlgoBrute {
    static void primsAlgo(ArrayList<ArrayList<Node>> adj, int N){
        int[] key = new int[N];
        int[] parent = new int[N];
        boolean[] mst = new boolean[N];

        for(int i = 0; i < N; i++){
            key[i] = (int)(Math.pow(10, 9));
            parent[i] = -1;
            mst[i] = false;
        }

        key[0] = 0;

        for(int i = 0; i < N - 1; i++){
            int min = Integer.MAX_VALUE, u = 0;
            for(int v = 0; v < N; v++){
                if(!mst[v] && key[v] < min){
                    min = key[v];
                    u = v;
                }
            }
            mst[u] = true;


        }
    }
}
