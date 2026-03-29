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

        for(int i = 1; i <= m; i++) {  // ✅ FIXED
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
}