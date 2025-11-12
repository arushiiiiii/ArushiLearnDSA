import java.util.ArrayList;

public class DFS {
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        // marking current node as visited
        vis[node] = true;
        ls.add(node);

        // getting neighbour nodes
        for(Integer it : adj.get(node)) {
            if(!vis[it]) {
                dfs(it, vis, adj, ls);
            }
        }
    }

    // function to return a list containing the DFS traversal of the graph.
    public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[v + 1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

//        BFS b = new BFS();   if the method was not static then we will have to instantiate the BFS class.
//        ArrayList<Integer> ans = b.bfsOfGraph(5, adj);    b is used to call its non-static method bfsOfGraph()
        ArrayList<Integer> ans = dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
