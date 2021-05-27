package GFG.Graph;

import CustomClasses.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleUnDirectedGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adj = graph.createUndirectedGraph();
        System.out.println(IsCycle(graph.V, adj));

    }

    private static boolean IsCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (DFS(i, adj, visited, -1))
                    return true;
            }
        }
        return false;
    }

    private static boolean DFS(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent) {
        visited[s] = true;
        for (int v : adj.get(s)) {
            if (!visited[v]) {
                if (DFS(v, adj, visited, s))
                    //System.out.println("p-"+s+"c-"+v);
                    return true;
            } else if (v != parent) {
                return true;
            }
        }
        return false;
    }
}
