package GFG.Graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(), E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            addEdge(adj, u, v);
        }
        ArrayList<Integer> ans = bfsOfGraph(V, adj);
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        visited[0] = true;
        queue.add(0);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans.add(u);
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }

        return ans;
    }
}
