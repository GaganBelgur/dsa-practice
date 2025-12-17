package test.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.minimuminsertionspalindrome;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.minimuminsertionspalindrome.MinimumInsertionsPalindromeSubSequenceSolver;
import org.junit.Assert;
import org.junit.Test;

public abstract class BaseMinimumInsertionsPalindromeSubSequenceSolverTest {

    protected abstract MinimumInsertionsPalindromeSubSequenceSolver getSolver();

    @Test
    public void GivenValidStringWhenPalindromeIsInvokedThenLongestPalindromeLengthIsReturned() {
        String str = "ABCAA";

        int expected = 2;
        int actual = getSolver().minInsertion(str);

        Assert.assertEquals(expected, actual);
    }
}
