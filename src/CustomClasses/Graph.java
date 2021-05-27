package CustomClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
    public int V, E;
    final private Scanner sc;

    public Graph() {
        sc = new Scanner(System.in);
        this.V = sc.nextInt();
        this.E = sc.nextInt();
    }


    public ArrayList<ArrayList<Integer>> createUndirectedGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            addEdgeUndirected(adj, u, v);
        }
        return adj;
    }

    public ArrayList<ArrayList<Integer>> createDirectedGraph() {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            addEdgeDirected(adj, u, v);
        }
        return adj;
    }

    private void addEdgeUndirected(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private void addEdgeDirected(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
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
