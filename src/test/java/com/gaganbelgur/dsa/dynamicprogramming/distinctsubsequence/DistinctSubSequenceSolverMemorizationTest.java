package test.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequence;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences.DistinctSubSequenceSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences.DistinctSubSequenceSolverMemorizationImpl;

public class DistinctSubSequenceSolverMemorizationTest extends BaseDistinctSubSequenceSolverTest {

    private final DistinctSubSequenceSolverInterface solverInterface = new DistinctSubSequenceSolverMemorizationImpl();

    @Override
    public DistinctSubSequenceSolverInterface getSolver() {
        return solverInterface;
    }
}
