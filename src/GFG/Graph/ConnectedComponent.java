package GFG.Graph;

import CustomClasses.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class ConnectedComponent {

    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adj = graph.createGraph();
        System.out.println("Connected Component : " + DFS(adj, graph.V));

    }

    private static int DFS(ArrayList<ArrayList<Integer>> adj, int V) {
        int count = 0;
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSUtil(adj, i, visited);
                count++;
            }

        }
        return count;
    }

    private static void DFSUtil(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        for (int v : adj.get(s)) {
            if (!visited[v])
                DFSUtil(adj, v, visited);
        }
    }


}
