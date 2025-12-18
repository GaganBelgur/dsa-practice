package main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences;

import java.util.Arrays;

public class DistinctSubSequenceSolverMemorizationImpl implements DistinctSubSequenceSolverInterface {

    @Override
    public int distinctSubsequences(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return distinctSubsequences(s1.length() - 1, s2.length() - 1, s1, s2, dp);
    }

    private int distinctSubsequences(int index1, int index2, String s1, String s2, int[][] dp) {
        if (index2 < 0) return 1;
        if (index1 < 0) return 0;
        if (dp[index1][index2] != -1) return dp[index1][index2];

        int result;

        if (s1.charAt(index1) == s2.charAt(index2)) {
            int matchedAndConsidered = distinctSubsequences(index1 - 1, index2 - 1, s1, s2, dp);
            int lookingForDifferentMatch = distinctSubsequences(index1 - 1, index2, s1, s2, dp);
            result = matchedAndConsidered + lookingForDifferentMatch;
            result %= prime;
        } else {
            result = distinctSubsequences(index1 - 1, index2, s1, s2, dp);
        }

        dp[index1][index2] = result;
        return result;
    }
}
