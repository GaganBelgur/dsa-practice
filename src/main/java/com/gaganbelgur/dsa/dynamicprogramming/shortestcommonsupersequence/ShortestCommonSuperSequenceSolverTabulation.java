package main.java.com.gaganbelgur.dsa.dynamicprogramming.shortestcommonsupersequence;

public class ShortestCommonSuperSequenceSolverTabulation implements ShortestCommonSuperSequenceSolverInterface {

    @Override
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];

        lcs(str1, str2, n, m, dp);

        int index1 = n;
        int index2 = m;
        StringBuilder result = new StringBuilder();

        while (index1 > 0 && index2 > 0) {

            if (str1.charAt(index1 - 1) == str2.charAt(index2 - 1)) {
                result.append(str1.charAt(index1 - 1));
                index1--;
                index2--;
            } else if (dp[index1 - 1][index2] > dp[index1][index2 - 1]) {
                result.append(str1.charAt(index1 - 1));
                index1--;
            } else {
                result.append(str2.charAt(index2 - 1));
                index2--;
            }
        }

        while (index1 > 0) {
            result.append(str1.charAt(index1 - 1));
            index1--;
        }

        while (index2 > 0) {
            result.append(str2.charAt(index2 - 1));
            index2--;
        }

        return result.reverse().toString();
    }

    private void lcs(String str1, String str2, int n, int m, int[][] dp) {
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
    }
}
