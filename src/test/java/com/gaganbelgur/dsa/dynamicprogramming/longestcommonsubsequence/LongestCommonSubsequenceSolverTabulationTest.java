package test.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolver;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolverTabulation;

public class LongestCommonSubsequenceSolverTabulationTest extends BaseLongestCommonSubsequenceSolverTest {

    private final LongestCommonSubsequenceSolver solver = new LongestCommonSubsequenceSolverTabulation();

    @Override
    protected LongestCommonSubsequenceSolver getSolver() {
        return solver;
    }
}
