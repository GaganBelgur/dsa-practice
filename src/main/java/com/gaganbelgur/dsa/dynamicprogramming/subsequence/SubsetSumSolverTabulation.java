package main.java.com.gaganbelgur.dsa.dynamicprogramming.subsequence;

public class SubsetSumSolverTabulation implements SubsetSumSolverInterface {
    @Override
    public boolean isSubsetSumPresent(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n][target + 1];

        for (int i=0; i<n;i++) {
            dp[i][0] = true;
        }

        if(arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        return isSubsetPresent(arr, n, target, dp);
    }

    private boolean isSubsetPresent(int[] arr, int n, int target, boolean[][] dp) {
        for(int index = 1; index < n; index++) {
            for(int j = 1; j <= target; j++) {
                boolean pick = false;
                boolean notPick = dp[index-1][j];

                if(arr[index] <= j) {
                    pick = dp[index - 1][j-arr[index]];
                }

                dp[index][j] = pick || notPick;
            }
        }

        return dp[n - 1][target];
    }
}
