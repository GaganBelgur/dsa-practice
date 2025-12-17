package test.java.com.gaganbelgur.dsa.dynamicprogramming.subsetsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.subset.SubsetSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.subset.SubsetSumSolverRecursion;

public class SubsetSumSolverRecursionTest extends BaseSubsetSumSolverTest {

    private final SubsetSumSolverInterface solver = new SubsetSumSolverRecursion();

    @Override
    protected SubsetSumSolverInterface getSolver() {
        return solver;
    }
}
