package test.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.FallingPathSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.MinimumFallingPathSumRecursion;

public class MinimumFallingPathSumRecursionSolverTest extends BaseFallingPathSumSolverTest {

    private final FallingPathSumSolverInterface solver = new MinimumFallingPathSumRecursion();

    @Override
    protected FallingPathSumSolverInterface getSolver() {
        return solver;
    }
}
