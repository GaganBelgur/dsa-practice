package test.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolver;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolverSpaceOptimized;

public class LongestCommonSubsequenceSolverSpaceOptimizationTest extends BaseLongestCommonSubsequenceSolverTest {

    private final LongestCommonSubsequenceSolver solver = new LongestCommonSubsequenceSolverSpaceOptimized();

    @Override
    protected LongestCommonSubsequenceSolver getSolver() {
        return solver;
    }
}
