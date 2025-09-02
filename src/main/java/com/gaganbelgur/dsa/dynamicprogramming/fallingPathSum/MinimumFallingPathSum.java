package main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingPathSum;

public class MinimumFallingPathSum {
    private static final FallingPathSumSolverInterface solver = new MinimumFallingPathSumRecursion();

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}
        };

        System.out.println("Minimum Falling Path Sum: " + solver.minFallingPathSum(matrix));
    }
}
