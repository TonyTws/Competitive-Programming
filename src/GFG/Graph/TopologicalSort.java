package GFG.Graph;

import CustomClasses.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {
    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adj = graph.createDirectedGraph();
        int[] arr = topoSort(graph.V, adj);
        System.out.println(Arrays.toString(arr));
    }


    private static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDeg = new int[V];
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                inDeg[v]++;
            }
        }
        System.out.println(Arrays.toString(inDeg));
        int[] ans = new int[V];

        Queue<Integer> queue = new LinkedList<>();
        for (int v = 0; v < V; v++) {
            if (inDeg[v] == 0) {
                queue.add(v);
            }
        }

        int k = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans[k++] = u;
            for (int v : adj.get(u)) {
                inDeg[v]--;
                if (inDeg[v] == 0)
                    queue.add(v);
            }
        }
        return ans;
    }
}
