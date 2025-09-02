package main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingPathSum;

import java.util.Arrays;

/**
 * MinimumFallingPathSumMemorisation
 * A class to compute the minimum falling path sum in a given matrix.
 */
public class MinimumFallingPathSumMemorisation implements FallingPathSumSolverInterface {
    /**
     * Finds the minimum falling path sum in the given matrix.
     *
     * @param matrix The input 2D Array
     * @return Minimum falling path sum, or -1 if no valid path exists
     */
    @Override
    public int minFallingPathSum(int[][] matrix) {
        if(matrix.length == 0) return -1;

        int minSum = Integer.MAX_VALUE;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows][columns];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        for (int col = 0; col < columns; col++) {
            int sum = minPathSum(matrix, 0, col, rows, columns, dp);
            minSum = Math.min(sum, minSum);
        }
        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }

    /**
     *
     * @param matrix The input 2D Array
     * @param row Current row index
     * @param col Current column index
     * @param rows Total rows
     * @param columns Total columns
     * @return Minimum Path sum
     */
    private int minPathSum(int[][] matrix, int row, int col, int rows, int columns, int[][] dp) {
        if (col < 0 || col >= columns || row >= rows) return Integer.MAX_VALUE;
        if (row == rows - 1) return matrix[row][col];
        if(dp[row][col] != -1) return dp[row][col];

        int diagonalLeft = minPathSum(matrix, row + 1, col - 1, rows, columns, dp);
        int down = minPathSum(matrix, row + 1, col, rows, columns, dp);
        int diagonalRight = minPathSum(matrix, row + 1, col + 1, rows, columns, dp);

        int bestMin = Math.min(down, Math.min(diagonalLeft, diagonalRight));

        if (bestMin == Integer.MAX_VALUE) {
            dp[row][col] = Integer.MAX_VALUE;
        } else{
            dp[row][col] = matrix[row][col] + bestMin;
        }

        return dp[row][col];
    }
}