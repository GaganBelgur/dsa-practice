package test.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences.DistinctSubSequenceSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences.DistinctSubSequenceSolverRecursionImpl;

public class DistinctSubSequenceSolverRecursionTest extends BaseDistinctSubSequenceSolverTest {

    private final DistinctSubSequenceSolverInterface solverInterface = new DistinctSubSequenceSolverRecursionImpl();

    @Override
    public DistinctSubSequenceSolverInterface getSolver() {
        return solverInterface;
    }
}
