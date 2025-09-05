package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobMaxChocolatesRecursion;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.ThreeDimensionDPProblemSolver;

public class AliceBobMaxChocolatesRecursionTest extends BaseThreeDimensionsTests {

    private final ThreeDimensionDPProblemSolver solver = new AliceBobMaxChocolatesRecursion();

    @Override
    protected ThreeDimensionDPProblemSolver getSolver() {
        return solver;
    }
}
