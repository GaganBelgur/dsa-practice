package test.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring;

import main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring.LongestNonRepeatingSubStringCharacterSolverInterface;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class BaseLongestSubstringSolverTest {

    protected abstract LongestNonRepeatingSubStringCharacterSolverInterface getSolver();

    @Test
    public void GivenValidStringWhenLongestNonRepeatingSubStringCharacterIsInvokedThenNonNegativeResultShouldBeReceived() {
        String str = "abcddabac";
        assertEquals(4, getSolver().longestNonRepeatingSubstring(str));
    }

    @Test
    public void GivenEmptyStringWhenLongestNonRepeatingSubStringCharacterIsInvokedThenZeroResultShouldBeReceived() {
        String str = "";
        assertEquals(0, getSolver().longestNonRepeatingSubstring(str));
    }

    @Test
    public void GivenValidRepeatingStringWhenLongestNonRepeatingSubStringCharacterIsInvokedThenNonNegativeResultShouldBeReceived() {
        String str = "aaaaa";
        assertEquals(1, getSolver().longestNonRepeatingSubstring(str));
    }

}
