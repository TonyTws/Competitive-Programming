package GFG.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {

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
