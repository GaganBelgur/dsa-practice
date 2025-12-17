package test.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.longestpalindrome;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.longestpalindrome.LongestPalindromeSubSequenceSolver;
import org.junit.Assert;
import org.junit.Test;

public abstract class BaseLongestPalindromeSubSequenceSolverTest {

    protected abstract LongestPalindromeSubSequenceSolver getSolver();

    @Test
    public void GivenValidStringWhenPalindromeIsInvokedThenLongestPalindromeLengthIsReturned() {
        String str = "EEEME";

        int expected = 4;
        int actual = getSolver().longestPalindromeSubsequence(str);

        Assert.assertEquals(expected, actual);
    }
}
