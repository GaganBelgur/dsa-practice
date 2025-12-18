package test.java.com.gaganbelgur.dsa.dynamicprogramming.shortestcommonsupersequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.shortestcommonsupersequence.ShortestCommonSuperSequenceSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.shortestcommonsupersequence.ShortestCommonSuperSequenceSolverTabulation;

public class ShortestCommonSuperSequenceSolverTabulationTest extends BaseShortestCommonSuperSequenceSolverTest {

    private final ShortestCommonSuperSequenceSolverTabulation solver = new ShortestCommonSuperSequenceSolverTabulation();

    @Override
    protected ShortestCommonSuperSequenceSolverInterface getSolver() {
        return solver;
    }
}
