package main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

public class LongestCommonSubsequenceSolverRecursion implements LongestCommonSubsequenceSolver {

    @Override
    public int lcs(String str1, String str2) {
        return lcs(str1, str2);
    }

    private int findLCS(String str1, String str2, int index1, int index2) {
        if (index1 < 0 || index2 < 0) return 0;

        int ans = 0;
        if (str1.charAt(index1) == str2.charAt(index2)) {
            ans = 1 + findLCS(str1, str2, index1 - 1, index2 - 1);
        } else {
            ans =
                    Math.max(
                            findLCS(str1, str2, index1 - 1, index2),
                            findLCS(str1, str2, index1, index2 - 1));
        }
        return ans;
    }
}
