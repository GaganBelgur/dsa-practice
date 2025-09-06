package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobMaxChocolatesTabulation;
import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.ThreeDimensionDPProblemSolver;

public class AliceBobMaxChocolatesTabulationTest extends BaseThreeDimensionsTests {

    private final ThreeDimensionDPProblemSolver solver = new AliceBobMaxChocolatesTabulation();

    @Override
    protected ThreeDimensionDPProblemSolver getSolver() {
        return solver;
    }
}
