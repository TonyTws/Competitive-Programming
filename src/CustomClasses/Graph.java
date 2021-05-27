package CustomClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
    public int V, E;

    public ArrayList<ArrayList<Integer>> createGraph() {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            addEdge(adj, u, v);
        }
        return adj;
    }

    private void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printG(ArrayList<ArrayList<Integer>> adj) {
        for (List<Integer> integers : adj) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
