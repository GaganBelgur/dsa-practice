package main.java.com.gaganbelgur.dsa.dynamicprogramming.subset;

import java.util.Arrays;

public class SubsetSumSolverMemorization implements SubsetSumSolverInterface {
    @Override
    public boolean isSubsetSumPresent(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return isSubsetPresent(arr, n - 1, target, dp);
    }

    private boolean isSubsetPresent(int[] arr, int index, int target, int[][] dp) {
        if (target == 0) return true;
        if (index == 0) return arr[index] == target;
        if (dp[index][target] != -1) {
            return dp[index][target] != 0;
        }

        boolean notTake = isSubsetPresent(arr, index - 1, target, dp);
        boolean take = false;

        if (target >= arr[index]) {
            take = isSubsetPresent(arr, index - 1, target - arr[index], dp);
        }

        dp[index][target] = (take || notTake) ? 1 : 0;
        return take || notTake;
    }
}
