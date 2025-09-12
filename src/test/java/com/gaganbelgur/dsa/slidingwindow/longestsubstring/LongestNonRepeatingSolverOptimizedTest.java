package test.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring;

import main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring.LongestNonRepeatingSolverOptimized;
import main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring.LongestNonRepeatingSubStringCharacterSolverInterface;

public class LongestNonRepeatingSolverOptimizedTest extends BaseLongestSubstringSolverTest {

    private final LongestNonRepeatingSubStringCharacterSolverInterface solver = new LongestNonRepeatingSolverOptimized();

    @Override
    protected LongestNonRepeatingSubStringCharacterSolverInterface getSolver() {
        return solver;
    }
}
