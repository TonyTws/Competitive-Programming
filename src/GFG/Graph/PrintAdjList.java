package GFG.Graph;

import CustomClasses.Graph;

import java.util.ArrayList;


public class PrintAdjList {
    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adj = graph.createGraph();
        graph.printG(printGraph(graph.V, adj));

    }


    public static ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ans.add(new ArrayList<>());
            ans.get(i).add(i);
        }

        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                ans.get(i).add(adj.get(i).get(j));
            }
        }
        return ans;
    }
}
