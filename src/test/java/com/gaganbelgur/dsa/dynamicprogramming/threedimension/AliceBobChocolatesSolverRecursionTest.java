package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolverRecursion;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolver;

public class AliceBobChocolatesSolverRecursionTest extends BaseAliceBobChocolatesSolverTest {

    private final AliceBobChocolatesSolver solver = new AliceBobChocolatesSolverRecursion();

    @Override
    protected AliceBobChocolatesSolver getSolver() {
        return solver;
    }
}
