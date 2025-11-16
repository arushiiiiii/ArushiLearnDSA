import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
// Graphs with negative weights are not applicable for Dijkstra algo because it will cause infinite loop.
// time complexity - E log V
// we use priority queue because we want minimum distance at first. Also to avoid extra iterations which happen in Queue
// In c++, Set can also be used instead of priority queue to erase already existing paths with greater distance but in java, using treeSet or hashSet is not possible
public class ShortestDistDijkstra {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.first - y.first);
        int[] dist = new int[n+1];
        int[] parent = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dist[i] = (int)1e9;
            parent[i] = i;
        }

        dist[1] = 0;
        pq.add(new Pair(0, 1));
        while (!pq.isEmpty()) {
            Pair it = pq.peek();
            int node = it.second;
            int dis = it.first;
            pq.remove();

            for (Pair p : adj.get(node)) {
                int adjNode = p.first;
                int wt = p.second;
                if (dis + wt < dist[adjNode]) {
                    dist[adjNode] = dis + wt;
                    pq.add(new Pair(dis + wt, adjNode));
                    parent[adjNode] = node;
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        if (dist[n] == 1e9) {
            path.add(-1);
            return path;
        }
        int node = n;
        // O(n)
        while (parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(1);
        Collections.reverse(path);
        return path;
    }
    // O(n log m) + O(n)
}
