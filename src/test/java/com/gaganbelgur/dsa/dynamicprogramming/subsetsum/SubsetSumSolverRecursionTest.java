package test.java.com.gaganbelgur.dsa.dynamicprogramming.subsetsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.subsequence.SubsetSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.subsequence.SubsetSumSolverRecursion;

public class SubsetSumSolverRecursionTest extends BaseSubsetSumSolverTest {

    @Override
    protected SubsetSumSolverInterface getSolver() {
        return new SubsetSumSolverRecursion();
    }
}
