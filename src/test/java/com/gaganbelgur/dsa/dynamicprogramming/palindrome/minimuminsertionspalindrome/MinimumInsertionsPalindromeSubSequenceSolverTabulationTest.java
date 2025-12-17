package test.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.minimuminsertionspalindrome;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.minimuminsertionspalindrome.MinimumInsertionsPalindromeSubSequenceSolver;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.palindrome.minimuminsertionspalindrome.MinimumInsertionsPalindromeSubSequenceSolverTabulation;

public class MinimumInsertionsPalindromeSubSequenceSolverTabulationTest extends BaseMinimumInsertionsPalindromeSubSequenceSolverTest {

    private final MinimumInsertionsPalindromeSubSequenceSolver solver = new MinimumInsertionsPalindromeSubSequenceSolverTabulation();

    @Override
    protected MinimumInsertionsPalindromeSubSequenceSolver getSolver() {
        return solver;
    }
}
