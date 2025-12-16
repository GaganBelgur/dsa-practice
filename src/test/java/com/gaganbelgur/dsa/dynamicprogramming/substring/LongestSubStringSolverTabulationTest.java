package test.java.com.gaganbelgur.dsa.dynamicprogramming.substring;


import main.java.com.gaganbelgur.dsa.dynamicprogramming.substring.longestcommon.LongestCommonSubStringSolverTabulation;

public class LongestSubStringSolverTabulationTest extends BaseLongestSubStringSolverTest {

    private final LongestCommonSubStringSolverTabulation solver = new LongestCommonSubStringSolverTabulation();

    @Override
    protected LongestCommonSubStringSolverTabulation getSolver() {
        return solver;
    }
}
