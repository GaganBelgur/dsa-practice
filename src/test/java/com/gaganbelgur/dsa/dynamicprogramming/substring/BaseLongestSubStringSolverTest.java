package test.java.com.gaganbelgur.dsa.dynamicprogramming.substring;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.substring.longestcommon.LongestCommonSubStringSolverTabulation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class BaseLongestSubStringSolverTest {

    protected abstract LongestCommonSubStringSolverTabulation getSolver();

    @Test
    public void GivenTwoStringsWhenLCSIsInvokedThenCorrectLengthIsReturned() {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        assertEquals(1, getSolver().lcs(str1, str2));
    }

    @Test
    public void GivenTwoStringsWithNoCommonSubstringWhenLCSIsInvokedThenZeroIsReturned() {
        String str1 = "ABC";
        String str2 = "DEF";
        assertEquals(0, getSolver().lcs(str1, str2));
    }

    @Test
    public void GivenTwoStringsWithFullCommonSubstringWhenLCSIsInvokedThenCorrectLengthIsReturned() {
        String str1 = "ABC";
        String str2 = "ABC";
        assertEquals(3, getSolver().lcs(str1, str2));
    }

    @Test
    public void GivenOneEmptyStringWhenLCSIsInvokedThenMinusOneIsReturned() {
        String str1 = "";
        String str2 = "ABC";
        assertEquals(-1, getSolver().lcs(str1, str2));
    }

    @Test
    public void GivenAnotherOneEmptyStringWhenLCSIsInvokedThenMinusOneIsReturned() {
        String str1 = "ABC";
        String str2 = "";
        assertEquals(-1, getSolver().lcs(str1, str2));
    }

    @Test
    public void GivenTwoEmptyStringsWhenLCSIsInvokedThenMinusOneIsReturned() {
        String str1 = "";
        String str2 = "";
        assertEquals(-1, getSolver().lcs(str1, str2));
    }

    @Test
    public void GivenStringsWithMultipleCommonSubstringsWhenLCSIsInvokedThenLongestIsReturned() {
        String str1 = "ABABC";
        String str2 = "BABCA";
        assertEquals(4, getSolver().lcs(str1, str2)); // "ABC" is the longest common substring
    }

}
