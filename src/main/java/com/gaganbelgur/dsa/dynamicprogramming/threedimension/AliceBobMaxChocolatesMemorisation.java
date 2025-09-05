package main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import java.util.Arrays;

public class AliceBobMaxChocolatesMemorisation implements ThreeDimensionDPProblemSolver {

    @Override
    public int maxChocolates(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length < 2) return -1;

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][][] dp = new int[rows][columns][columns];

        for (int[][] row1 : dp) {
            for (int[] row2 : row1) {
                Arrays.fill(row2, -1);
            }
        }

        return findMaxChocolates(0, 0, columns - 1, rows, columns, matrix, dp);
    }

    /**
     * Finds maximum chocolates two players can collect starting from top row.
     * Alice starts at (0,0), Bob starts at (0, columns-1).
     * Both move down one row at a time and can shift left, down, or right.
     * If both land on the same cell, chocolate is counted only once.
     *
     * @param row Current row index
     * @param j1  Alice's column position
     * @param j2  Bob's column position
     * @param rows Total number of rows
     * @param columns Total number of columns
     * @param matrix The grid of chocolates
     * @param dp Memoization table (3D: row × j1 × j2)
     * @return Maximum chocolates collectible from this state
     */
    private int findMaxChocolates(int row, int j1, int j2, int rows, int columns, int[][] matrix, int[][][] dp) {
        if (j1 < 0 || j1 >= columns || j2 < 0 || j2 >= columns) return Integer.MIN_VALUE;

        if (row == rows - 1) {
            return (j1 == j2) ? matrix[row][j1] : matrix[row][j1] + matrix[row][j2];
        }

        if (dp[row][j1][j2] != -1) return dp[row][j1][j2];

        int maxChocolates = 0;

        for (int dj1: directions) {
            for (int dj2: directions) {
                int next = findMaxChocolates(row + 1, j1 + dj1, j2 + dj2, rows, columns, matrix, dp);
                int current = (j1 == j2) ? matrix[row][j1] : matrix[row][j1] + matrix[row][j2];
                maxChocolates = Math.max(maxChocolates, next + current);
            }
        }

        dp[row][j1][j2] = maxChocolates;
        return maxChocolates;
    }
}
