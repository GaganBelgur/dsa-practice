package main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

public interface ThreeDimensionDPProblemSolver {

    /**
     * Allowed column movements per step: {-1, 0, 1} where -1 = move left, 0 = stay in the same column, +1 = move right
     */
    int[] directions = {-1, 0, 1};

    int maxChocolates(int[][] matrix);
}
