package main.java.com.gaganbelgur.dsa.dynamicprogramming.countpartitions;

import java.util.Arrays;

public class CountPartitionsMemorizationSolver implements CountPartitionsSolverInterface {
    @Override
    public int countPartitions(int n, int diff, int[] arr) {
        int totalSum = 0;
        for(int num: arr) totalSum += num;

        int result = totalSum - diff;
        if(result < 0) return 0;
        if(result % 2 == 1) return 0;

        int s2 = result/2;

        int[][] dp = new int[n][s2+1];
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        return findPartitionsCount(n-1, s2, arr, dp);
    }

    private int findPartitionsCount(int index, int sum, int[] arr, int[][] dp) {
        if(index == 0) {
            if(sum == 0 && arr[0] == 0) return 2;
            if(sum == 0 || arr[0] == sum) return 1;
            return 0;
        }

        if(dp[index][sum] != -1) return dp[index][sum];

        int notPick = findPartitionsCount(index - 1, sum, arr, dp);

        int pick = 0;
        if(arr[index] <= sum) {
            pick = findPartitionsCount(index - 1, sum - arr[index], arr, dp);
        }

        return dp[index][sum] = (pick + notPick) % ((int)(1e9) + 7);
    }
}
