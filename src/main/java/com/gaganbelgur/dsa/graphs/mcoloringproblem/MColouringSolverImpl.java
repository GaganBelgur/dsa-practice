package main.java.com.gaganbelgur.dsa.graphs.mcoloringproblem;

import java.util.ArrayList;
import java.util.List;

public class MColouringSolverImpl implements MColoringProblemSolverInterface {
    @Override
    public boolean graphColoring(int[][] edges, int m, int n) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        int[] colors = new int[n];

        return graphColor(0, m, n, colors, adjacencyList);
    }

    private boolean graphColor(int node, int m, int n, int[] colors, List<List<Integer>> adjacencyList) {
        if(node == n) return true;

        for(int i = 1; i <= m; i++) {
            if(canNodeBeColored(i, node, colors, adjacencyList)) {
                colors[node] = i;

                if(graphColor(node + 1, m, n, colors, adjacencyList)) return true;

                colors[node] = 0; // backtrack
            }
        }

        return false;
    }

    private boolean canNodeBeColored(int color, int node, int[] colors, List<List<Integer>> adjacencyList) {
        for(int neighbor : adjacencyList.get(node)) {
            if(colors[neighbor] == color) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MColouringSolverImpl sol = new MColouringSolverImpl();
        int[][] edges = {
                {0, 1}, {0, 2}, {1, 2}, {1, 3}
        };
        int m = 3; // Number of colors
        int n = 4; // Number of nodes

        // Check if the graph can be colored with m colors
        if (sol.graphColoring(edges, m, n)) {
            System.out.println("The graph can be colored with " + m + " colors.");
        } else {
            System.out.println("The graph cannot be colored with " + m + " colors.");
        }
    }
}