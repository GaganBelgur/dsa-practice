package test.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolver;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolverRecursion;

public class LongestCommonSubsequenceSolverRecursionTest extends BaseLongestCommonSubsequenceSolverTest {

    private final LongestCommonSubsequenceSolver solver = new LongestCommonSubsequenceSolverRecursion();

    @Override
    protected LongestCommonSubsequenceSolver getSolver() {
        return solver;
    }
}
