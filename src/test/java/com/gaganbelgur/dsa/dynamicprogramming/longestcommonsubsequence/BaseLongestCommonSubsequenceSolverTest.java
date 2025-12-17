package test.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolver;
import org.junit.Assert;
import org.junit.Test;

public abstract class BaseLongestCommonSubsequenceSolverTest {

    protected abstract LongestCommonSubsequenceSolver getSolver();

    @Test
    public void GivenTwoStringsWhenLCSIsInvokedThenCorrectLengthIsReturned() {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        int expected = 3;
        int actual = getSolver().lcs(str1, str2);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void GivenTwoNonCommonStringsWhenLCSIsInvokedThenCorrectLengthIsReturned() {
        String str1 = "AGGTAB";
        String str2 = "XY";
        int expected = 0;
        int actual = getSolver().lcs(str1, str2);

        Assert.assertEquals(expected, actual);
    }
}
