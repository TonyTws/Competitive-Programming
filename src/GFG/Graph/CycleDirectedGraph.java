package GFG.Graph;

import CustomClasses.Graph;

import java.util.ArrayList;

public class CycleDirectedGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adj = graph.createDirectedGraph();
        System.out.println(IsCyclic(graph.V, adj));
    }

    private static boolean IsCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (DFS(i, adj, visited, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean DFS(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recStack) {
        visited[s] = true;
        recStack[s] = true;
        for (int v : adj.get(s)) {
            if (!visited[v]) {
                if (DFS(v, adj, visited, recStack)) {
                    return true;
                }
            } else if (recStack[v]) {
                return true;
            }
        }
        recStack[s] = false;
        return false;
    }
}
