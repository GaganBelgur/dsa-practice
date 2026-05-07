package main.java.com.gaganbelgur.dsa.dynamicprogramming.countsubsetsum;

import java.util.Arrays;

public class CountSubsetSumMemorizationSolver implements CountSubsetSumSolverInterface {
    private static final int MODULO = 1000000007;

    @Override
    public int perfectSum(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return findWays(arr, target, n - 1, dp);
    }

    private int findWays(int[] arr, int target, int index, int[][] dp) {
        if (target == 0) return 1;
        if (index == 0) return (arr[index] == target) ? 1 : 0;

        if (dp[index][target] != -1) {
            return dp[index][target];
        }

        int notPick = findWays(arr, target, index - 1, dp);
        int pick = 0;
        if (target >= arr[index]) {
            pick = findWays(arr, target - arr[index], index - 1, dp);
        }

        dp[index][target] = (notPick + pick) % MODULO;
        return dp[index][target];
    }
}
