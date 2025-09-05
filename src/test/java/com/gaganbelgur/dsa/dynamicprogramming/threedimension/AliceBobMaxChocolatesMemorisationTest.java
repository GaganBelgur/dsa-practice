package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobMaxChocolatesMemorisation;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.ThreeDimensionDPProblemSolver;

public class AliceBobMaxChocolatesMemorisationTest extends BaseThreeDimensionsTests {

    private final ThreeDimensionDPProblemSolver solver = new AliceBobMaxChocolatesMemorisation();

    @Override
    protected ThreeDimensionDPProblemSolver getSolver() {
        return solver;
    }
}
