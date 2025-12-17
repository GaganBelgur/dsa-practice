package main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

public class LongestCommonSubsequenceSolverSpaceOptimized implements LongestCommonSubsequenceSolver {

    @Override
    public int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[] cur = new int[m + 1];
        int[] prev = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    cur[j] = 1 + prev[j - 1];
                } else {
                    cur[j] = Math.max(prev[j], cur[j - 1]);
                }
            }

            System.arraycopy(cur, 0, prev, 0, m + 1);
        }

        return prev[m];
    }
}
