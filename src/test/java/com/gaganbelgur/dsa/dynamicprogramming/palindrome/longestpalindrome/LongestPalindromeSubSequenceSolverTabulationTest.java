package test.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.longestpalindrome;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.longestpalindrome.LongestPalindromeSubSequenceSolver;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.longestpalindrome.LongestPalindromeSubSequenceSolverTabulation;

public class LongestPalindromeSubSequenceSolverTabulationTest extends BaseLongestPalindromeSubSequenceSolverTest {

    private final LongestPalindromeSubSequenceSolver solver = new LongestPalindromeSubSequenceSolverTabulation();

    @Override
    protected LongestPalindromeSubSequenceSolver getSolver() {
        return solver;
    }
}
