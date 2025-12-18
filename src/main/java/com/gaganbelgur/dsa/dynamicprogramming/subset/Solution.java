package main.java.com.gaganbelgur.dsa.dynamicprogramming.subset;

import java.util.*;

class Solution {
    /* Function to check if there is a subset
    of 'arr' with sum equal to 'target'*/
    private boolean func(int n, int target, int[] arr) {
        /* Initialize a 2D DP array with dimensions
        (n x target+1) to store subproblem results*/
        boolean[][] dp = new boolean[n][target + 1];

        // Base case (when target = 0)
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        /* Base case (If the first element of
        'arr' is less than or equal to 'target')*/
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        // Fill the DP array iteratively
        for (int ind = 1; ind < n; ind++) {
            for (int sum = 1; sum <= target; sum++) {
                /* If we don't take the current element, the
                result is the same as the previous row*/
                boolean notTaken = dp[ind - 1][sum];

                /* If we take the current element, subtract its
                value from the target and check the previous row*/
                boolean taken = false;
                if (arr[ind] <= sum) {
                    taken = dp[ind - 1][sum - arr[ind]];
                }

                /* Store the result in the DP
                array for the current subproblem*/
                dp[ind][sum] = notTaken || taken;
            }
        }

        // The final result is stored in dp[n-1][target]
        return dp[n - 1][target];
    }

    /* Function to check if there is a subset
    of 'arr' with sum equal to 'target'*/
    public boolean isSubsetSum(int[] arr, int target) {
        // Return the result
        return func(arr.length, target, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 4;

        // Create an instance of Solution class
        Solution sol = new Solution();

        // Call the isSubsetSum function and print the result
        if (sol.isSubsetSum(arr, target))
            System.out.println("Subset with the given target found");
        else
            System.out.println("Subset with the given target not found");
    }
}

