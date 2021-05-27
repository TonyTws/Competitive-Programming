package GFG.Graph;

import CustomClasses.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adj = graph.createGraph();
        for (Integer i : dfsOfGraph(graph.V, adj))
            System.out.println(i);

    }

    static ArrayList<Integer> ans = new ArrayList<>();

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        DFSUtil(adj, 0, visited);
        return ans;
    }

    private static void DFSUtil(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        ans.add(s);
        for (int v : adj.get(s)) {
            if (!visited[v])
                DFSUtil(adj, v, visited);
        }
    }
}
