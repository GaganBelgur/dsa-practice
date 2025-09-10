package test.java.com.gaganbelgur.dsa.dynamicprogramming.subsetsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.subsequence.SubsetSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.subsequence.SubsetSumSolverRecursion;

public class SubsetSumSolverRecursionTest extends BaseSubsetSumSolverTest {

    private final SubsetSumSolverInterface solver = new SubsetSumSolverRecursion();

    @Override
    protected SubsetSumSolverInterface getSolver() {
        return solver;
    }
}
