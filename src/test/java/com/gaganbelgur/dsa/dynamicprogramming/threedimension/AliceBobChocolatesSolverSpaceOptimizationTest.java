package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolverSpaceOptimization;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolver;

public class AliceBobChocolatesSolverSpaceOptimizationTest extends BaseAliceBobChocolatesSolverTest {

    private final AliceBobChocolatesSolver solver = new AliceBobChocolatesSolverSpaceOptimization();

    @Override
    protected AliceBobChocolatesSolver getSolver() {
        return solver;
    }
}
