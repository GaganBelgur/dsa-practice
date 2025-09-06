package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolverTabulation;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolver;

public class AliceBobChocolatesSolverTabulationTest extends BaseAliceBobChocolatesSolverTest {

    private final AliceBobChocolatesSolver solver = new AliceBobChocolatesSolverTabulation();

    @Override
    protected AliceBobChocolatesSolver getSolver() {
        return solver;
    }
}
