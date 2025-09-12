package test.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring;

import main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring.LongestNonRepeatingSolverBruteForce;
import main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring.LongestNonRepeatingSubStringCharacterSolverInterface;

public class LongestNonRepeatingSolverBruteForceTest extends BaseLongestSubstringSolverTest {

    private final LongestNonRepeatingSubStringCharacterSolverInterface solver = new LongestNonRepeatingSolverBruteForce();

    @Override
    protected LongestNonRepeatingSubStringCharacterSolverInterface getSolver() {
        return solver;
    }
}
