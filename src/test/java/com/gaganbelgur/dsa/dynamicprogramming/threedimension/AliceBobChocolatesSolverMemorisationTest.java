package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolverMemorisation;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolver;

public class AliceBobChocolatesSolverMemorisationTest extends BaseAliceBobChocolatesSolverTest {

    private final AliceBobChocolatesSolver solver = new AliceBobChocolatesSolverMemorisation();

    @Override
    protected AliceBobChocolatesSolver getSolver() {
        return solver;
    }
}
