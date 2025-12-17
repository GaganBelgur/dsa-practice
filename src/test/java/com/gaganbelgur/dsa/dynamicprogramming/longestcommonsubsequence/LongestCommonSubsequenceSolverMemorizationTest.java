package test.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolver;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.longestcommonsubsequence.LongestCommonSubsequenceSolverMemorization;

public class LongestCommonSubsequenceSolverMemorizationTest extends BaseLongestCommonSubsequenceSolverTest {

    private final LongestCommonSubsequenceSolver solver = new LongestCommonSubsequenceSolverMemorization();

    @Override
    protected LongestCommonSubsequenceSolver getSolver() {
        return solver;
    }
}
