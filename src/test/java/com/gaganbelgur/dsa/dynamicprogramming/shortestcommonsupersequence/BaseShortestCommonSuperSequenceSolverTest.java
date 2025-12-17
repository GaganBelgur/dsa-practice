package test.java.com.gaganbelgur.dsa.dynamicprogramming.shortestcommonsupersequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.shortestcommonsupersequence.ShortestCommonSuperSequenceSolverInterface;
import org.junit.Assert;
import org.junit.Test;

public abstract class BaseShortestCommonSuperSequenceSolverTest {

    protected abstract ShortestCommonSuperSequenceSolverInterface getSolver();

    @Test
    public void testShortestCommonSupersequence() {
        String str1 = "mno";
        String str2 = "nop";
        int actual = getSolver().shortestCommonSupersequence(str1, str2).length();
        int expected = 4;//mnop

        Assert.assertEquals(expected, actual);
    }
}
