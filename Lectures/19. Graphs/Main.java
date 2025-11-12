import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 3, m = 3;  // Always check for 1 base indexing
        // if the graph given is undirected
        // using Adjacency Matrix  - (Space Complexity O(n^2))
        int adj[][] = new int[n + 1][n + 1];

        // edge 1---2
        adj[1][2] = 1;
        adj[2][1] = 1;
        // In weighted graph
        // adj[1][2] = weight;

        // edge 2---3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1---3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // Basically if edge is u---v
        // adj[u][v] = 1;
        // adj[v][u] = 1;

        // using adjacency list - (Space Complexity O(2E) or O(E))
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        // n + 1
        for (int i = 0; i <= n; i++) {
            adj2.add(new ArrayList<Integer>());
        }

        // edge 1---2
        adj2.get(1).add(2);
        adj2.get(2).add(1);

        // edge 2---3
        adj2.get(2).add(3);
        adj2.get(3).add(2);

        // edge 1---3
        adj2.get(1).add(3);
        adj2.get(3).add(1);

        // basically edge u---v
        // adj2.get(u).add(v);
        // adj2.get(v).add(u);

        // print all the edges
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < adj2.get(i).size(); j++) {
                System.out.println(adj2.get(j) + " ");
            }
            System.out.println();
        }

        // if the graph is directed then you have to store only one edge
        // edge u--->v
        // adj[u][v] = 1;
        // or
        // adj2.get(u).add(v);

        // if the graph is weighted and we have to store it in list form, we will define a pair class of integer i.e. (Integer, Integer) = (to the edge directed, weight)
    }
}