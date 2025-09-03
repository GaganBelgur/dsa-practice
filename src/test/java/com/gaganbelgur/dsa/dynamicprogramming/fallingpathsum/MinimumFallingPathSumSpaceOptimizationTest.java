package test.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.FallingPathSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.MinimumFallingPathSumSpaceOptimization;

public class MinimumFallingPathSumSpaceOptimizationTest extends BaseFallingPathSumSolverTest {

    private final FallingPathSumSolverInterface solver = new MinimumFallingPathSumSpaceOptimization();

    @Override
    protected FallingPathSumSolverInterface getSolver() {
        return solver;
    }
}
