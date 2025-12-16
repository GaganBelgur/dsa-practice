package main.java.com.gaganbelgur.dsa.dynamicprogramming.substring.longestcommon;

public class LongestCommonSubStringSolverTabulation implements LongestCommonSubStringSolver {

    @Override
    public int lcs(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty()) return -1;

        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n+1][m+1];
        int maxCount = 0;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    maxCount = Math.max(dp[i][j], maxCount);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxCount;
    }
}
