package main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

import java.util.Arrays;

public class LongestCommonSubsequenceSolverMemorization implements LongestCommonSubsequenceSolver {

    @Override
    public int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return findLCS(str1, str2, n-1, m-1, dp);
    }

    private int findLCS(String str1, String str2, int index1, int index2, int[][] dp) {
        if (index1 < 0 || index2 < 0) return 0;
        if(dp[index1][index2] != -1) return dp[index1][index2];

        int ans;
        if (str1.charAt(index1) == str2.charAt(index2)) {
            ans = 1 + findLCS(str1, str2, index1 - 1, index2 - 1, dp);
        } else {
            ans = Math.max(findLCS(str1, str2, index1 - 1, index2, dp), findLCS(str1, str2, index1, index2 - 1, dp));
        }
        dp[index1][index2] = ans;
        return ans;
    }
}
