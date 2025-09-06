package main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

public class AliceBobMaxChocolatesTabulation implements ThreeDimensionDPProblemSolver {

    @Override
    public int maxChocolates(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length <= 1) return -1;

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][][] dp = new int[rows][columns][columns];
        fillLastRowElements(rows, columns, matrix, dp);
        return findMaxChocolates(rows, columns, matrix, dp);
    }

    /**
     * Initializes the DP table for the base case (last row).
     * In the last row, Alice and Bob cannot move further down.
     * Therefore, the chocolates they collect are simply:
     * - If Alice and Bob are in the same cell: matrix[lastRow][j1]
     * - If they are in different cells: matrix[lastRow][j1] + matrix[lastRow][j2]
     *
     * @param rows    Total number of rows
     * @param columns Total number of columns
     * @param matrix  Given input matrix where each cell contains chocolates
     * @param dp      A 3D DP array where:
     *                dp[row][j1][j2] = maximum chocolates Alice (at column j1)
     *                and Bob (at column j2) can collect starting from row "row" down to the last row.
     */
    private void fillLastRowElements(int rows, int columns, int[][] matrix, int[][][] dp) {
        int lastRow = rows - 1;
        for (int j1 = 0; j1 < columns; j1++) {
            for (int j2 = 0; j2 < columns; j2++) {
                dp[lastRow][j1][j2] = (j1 == j2) ? matrix[lastRow][j1] : matrix[lastRow][j1] + matrix[lastRow][j2];
            }
        }
    }

    /**
     * Populates the DP table for all rows (from bottom to top).
     * Transition:
     * - From a given state (row, j1, j2), Alice and Bob can move to:
     * (row + 1, j1 + dj1, j2 + dj2), where dj1 and dj2 = {-1, 0, 1}
     * - This allows them to move diagonally left, bottom, or diagonally right.
     * Recurrence:
     * dp[row][j1][j2] = max over all moves {
     * matrix[row][j1] + (j1 != j2 ? matrix[row][j2] : 0)
     * + dp[row + 1][nextJ1][nextJ2]
     * }
     * Boundary checks:
     * - Alice and Bob must remain inside the grid (0 <= nextJ1, nextJ2 < columns).
     * Final Answer:
     * dp[0][0][columns - 1] → maximum chocolates when Alice starts at (0,0)
     * and Bob starts at (0, columns-1).
     *
     * @param rows    Total number of rows
     * @param columns Total number of columns
     * @param matrix  Input matrix of chocolates
     * @param dp      3D DP table storing results for subproblems
     * @return Maximum chocolates Alice and Bob can collect
     */
    private int findMaxChocolates(int rows, int columns, int[][] matrix, int[][][] dp) {
        for (int row = rows - 2; row >= 0; row--) {
            for (int j1 = 0; j1 < columns; j1++) {
                for (int j2 = 0; j2 < columns; j2++) {
                    int maxChocolates = 0;

                    for (int dj1 : directions) {
                        for (int dj2 : directions) {
                            int nextJ1 = j1 + dj1;
                            int nextJ2 = j2 + dj2;

                            // Valid move check
                            if (nextJ1 >= 0 && nextJ1 < columns &&
                                    nextJ2 >= 0 && nextJ2 < columns) {

                                // Chocolates collected at current row
                                int chocolates = matrix[row][j1];
                                if (j1 != j2) {
                                    chocolates += matrix[row][j2];
                                }

                                // Add chocolates from next row’s optimal result
                                chocolates += dp[row + 1][nextJ1][nextJ2];

                                maxChocolates = Math.max(maxChocolates, chocolates);
                            }
                        }
                    }
                    dp[row][j1][j2] = maxChocolates;
                }
            }
        }
        return dp[0][0][columns - 1];
    }
}