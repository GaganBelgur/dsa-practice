package test.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.FallingPathSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.MinimumFallingPathSumTabulation;

public class MinimumFallingPathSumTabulationTest extends BaseFallingPathSumSolverTest {

    private final FallingPathSumSolverInterface solver = new MinimumFallingPathSumTabulation();

    @Override
    protected FallingPathSumSolverInterface getSolver() {
        return solver;
    }
}
