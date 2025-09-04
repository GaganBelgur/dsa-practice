package main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum;

/**
 * MinimumFallingPathSumTabulation
 * A class to compute the minimum falling path sum in a given matrix.
 */
public class MinimumFallingPathSumSpaceOptimization implements FallingPathSumSolverInterface {
    /**
     * Finds the minimum falling path sum in the given matrix.
     *
     * @param matrix The input 2D Array
     * @return Minimum falling path sum, or -1 if no valid path exists
     */
    @Override
    public int minFallingPathSum(int[][] matrix) {
        if (matrix.length == 0) return -1;

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] dp = new int[columns];

        copyLastRowToDpMatrix(matrix, dp, rows, columns);

        dp = minPathSum(matrix, dp, rows, columns);

        int minSum = findMinimumValueInFirstRow(dp, columns);

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }

    /**
     * Copies the last row of the input matrix into the DP array. Since the minimum falling path sum for the last row is just the cell value itself.
     *
     *  @param matrix The input 2D Array
     * @param dp A 2D matrix where dp[r][c] stores the minimum falling path sum starting from cell (r, c).
     * @param rows Total number of rows in matrix
     * @param columns Total number of columns in matrix
     */
    private void copyLastRowToDpMatrix(int[][] matrix, int[] dp, int rows, int columns) {
        if (columns >= 0) System.arraycopy(matrix[rows - 1], 0, dp, 0, columns);
    }

    /**
     * We start from the last row (base case: nothing below it). Fill from second-last row up to first row
     *
     * @param matrix The input 2D Array
     * @param dp A 2D matrix where dp[r][c] stores the minimum falling path sum starting from cell (r, c).
     * @param rows Total number of rows in matrix
     * @param columns Total number of columns in matrix
     *
     * @return dp array on every iteration the computed temp array is copied to final dp array.
     */
    private int[] minPathSum(int[][] matrix, int[] dp, int rows, int columns) {
        int[] newDP = new int[columns];
        for (int row = rows - 2; row >= 0; row--) {
            for (int col = 0; col < columns; col++) {
                int diagonalLeft = Integer.MAX_VALUE;
                if (col > 0) {
                    diagonalLeft = dp[col - 1];
                }

                int down = dp[col];

                int diagonalRight = Integer.MAX_VALUE;
                if (col < columns - 1) {
                    diagonalRight = dp[col + 1];
                }

                newDP[col] = matrix[row][col] + Math.min(down, Math.min(diagonalLeft, diagonalRight));
            }
            dp = newDP;
        }
        return dp;
    }

    /**
     * Finds the minimum value in the top row (stored in dp after computation).
     *
     * @param dp A 2D matrix where dp[r][c] stores the minimum falling path sum starting from cell (r, c).
     * @param columns Total Columns
     * @return Minimum value from the dp table
     */
    private int findMinimumValueInFirstRow(int[] dp, int columns) {
        int minValue = Integer.MAX_VALUE;
        for (int col = 0; col < columns; col++) {
            minValue = Math.min(minValue, dp[col]);
        }
        return minValue;
    }
}