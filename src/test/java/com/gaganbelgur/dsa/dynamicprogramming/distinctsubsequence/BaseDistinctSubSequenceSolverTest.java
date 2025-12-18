package test.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences.DistinctSubSequenceSolverInterface;
import org.junit.Assert;
import org.junit.Test;

public abstract class BaseDistinctSubSequenceSolverTest {

    public abstract DistinctSubSequenceSolverInterface getSolver();

    @Test
    public void testDistinctSubsequence() {
        String s1 = "babgbag";
        String s2 = "bag";
        int actual = getSolver().distinctSubsequences(s1, s2);
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDistinctSubsequence2() {
        String s1 = "abbc";
        String s2 = "ac";
        int actual = getSolver().distinctSubsequences(s1, s2);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }
}
