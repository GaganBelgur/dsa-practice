package main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

public class AliceBobMaxChocolatesRecursion implements ThreeDimensionDPProblemSolver {

    @Override
    public int maxChocolates(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length < 2) return -1;

        int rows = matrix.length;
        int columns = matrix[0].length;
        return findMaxChocolates(0, 0, columns - 1, rows, columns, matrix);
    }

    private int findMaxChocolates(int row, int j1, int j2, int rows, int columns, int[][] matrix) {
        if (j1 < 0 || j1 >= columns || j2 < 0 || j2 >= columns) return Integer.MIN_VALUE;

        if (row == rows - 1) {
            if (j1 == j2) {
                return matrix[row][j1];
            } else {
                return matrix[row][j1] + matrix[row][j2];
            }
        }

        int maxChocolates = 0;

        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for (int dj2 = -1; dj2 <= 1; dj2++) {
                if (j1 == j2) {
                    maxChocolates =
                            Math.max(
                                    maxChocolates,
                                    matrix[row][j1] + findMaxChocolates(row + 1, j1 + dj1, j2 + dj2, rows, columns, matrix));
                } else {
                    maxChocolates =
                            Math.max(
                                    maxChocolates,
                                    matrix[row][j1]
                                            + matrix[row][j2]
                                            + findMaxChocolates(row + 1, j1 + dj1, j2 + dj2, rows, columns, matrix));
                }
            }
        }
        return maxChocolates;
    }
}
