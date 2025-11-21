import java.util.ArrayList;
import java.util.PriorityQueue;

class pair {
    int node;
    int distance;
    public pair(int distance, int node) {
        this.node = node;
        this.distance = distance;
    }
}
public class PrimsAlgorithm {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        int[] vis = new int[V];
        // Space - O(E)
        pq.add(new pair(0, 0));
        int sum = 0;
        // Time -> E log E + E log E = E log E
        // Explanation-
        // E - while loop will run approx E times in worst case
        while (pq.size() > 0) {
            // E - at max E edges will be there in the queue
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            if (vis[node] == 1) continue;
            vis[node] = 1;
            sum += wt;
            // E log E - loop will run for all the edges , therefore E & for push operation log E
            for (int i = 0; i < adj.get(node).size(); i++) {
                int edw = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if (vis[adjNode] == 0) {
                    pq.add(new pair(edw, adjNode));
                }
            }
        }
        return sum;
    }
}
