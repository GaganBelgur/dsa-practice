package test.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.FallingPathSumSolverInterface;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.MinimumFallingPathSumMemorisation;

public class MinimumFallingPathSumMemorisationSolverTest extends BaseFallingPathSumSolverTest {

    private final FallingPathSumSolverInterface solver = new MinimumFallingPathSumMemorisation();

    @Override
    protected FallingPathSumSolverInterface getSolver() {
        return solver;
    }
}
