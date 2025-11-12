import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class CycleDetection {
    // Using BFS
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int src, int V, boolean[] vis) {
        vis[src] = true;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(src, -1));
        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for (int adjNode : adj.get(src)) {
                if (!vis[adjNode]) {
                    vis[adjNode] = true;
                    q.add(new Node(adjNode, node));
                }
                else if (parent != adjNode) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis, false);
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkForCycle(adj, i, V, vis)) return true;
            }
        }
        return false;
    }



    // Using DFS
    private static boolean dfs(int src, int parent, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[src] = 1;
        for (int adjNode : adj.get(src)) {
            if (vis[adjNode] == 0) {
                if (dfs(adjNode, src, adj, vis)) return true;
            }
            else if (parent != adjNode) return true;
        }
        return false;
    }

    public static boolean isCycle2(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        for(int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfs(i, -1, adj, vis)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example: Graph with 5 nodes and a cycle
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Add edges
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);
        adj.get(4).add(1);

        if (isCycle2(V, adj))
            System.out.println("Cycle detected");
        else
            System.out.println("No cycle found");
    }
}

