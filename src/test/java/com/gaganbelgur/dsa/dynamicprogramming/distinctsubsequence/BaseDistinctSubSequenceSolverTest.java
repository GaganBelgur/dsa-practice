package test.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences.DistinctSubSequenceSolverInterface;
import org.junit.Test;

public abstract class BaseDistinctSubSequenceSolverTest {

    public abstract DistinctSubSequenceSolverInterface getSolver();

    @Test
    public void testDistinctSubsequence() {
        String s1 = "babgbag";
        String s2 = "bag";
        int actual = getSolver().distinctSubsequences(s1, s2);
        int expected = 5;

        assert expected == actual;
    }
}
