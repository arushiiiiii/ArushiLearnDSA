import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// This is topological sort using bfs.
public class KahnAlgo {
    // insert all nodes with indegree zero.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] ans = new int[V];
        int i = 0;
        while(!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            ans[i++] = node;
            // node is in your topo sort
            // therefore remove it from the indegree

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return ans;
    }
    // time - O(v + e)
}
