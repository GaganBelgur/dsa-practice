package main.java.com.gaganbelgur.dsa.recursion.ratmaze;

import java.util.ArrayList;
import java.util.List;

public class RatMazeSolverImpl implements RateMazeSolverInterface {

    @Override
    public List<String> findPath(int[][] grid) {
        int n = grid.length;
        List<String> result = new ArrayList<String>();

        if (grid[0][0] == 0 || grid[n - 1][n - 1] == 0) return result;
        findDestination(grid, 0, 0, result, "", n);
        return result;
    }

    private void findDestination(int[][] grid, int i, int j, List<String> result, String dir, int n) {
        if (i == n - 1 && j == n - 1) {
            result.add(dir);
            return;
        }
        if (grid[i][j] == 0) return;

        grid[i][j] = 0;

        // up
        if (i > 0) {
            findDestination(grid, i - 1, j, result, dir + "U", n);
        }

        // right
        if (j < n - 1) {
            findDestination(grid, i, j + 1, result, dir + "R", n);
        }

        // down
        if (i < n - 1) {
            findDestination(grid, i + 1, j, result, dir + "D", n);
        }

        // left
        if (j > 0) {
            findDestination(grid, i, j - 1, result, dir + "L", n);
        }

        grid[i][j] = 1;
    }
}
