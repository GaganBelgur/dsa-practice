package test.java.com.gaganbelgur.dsa.slidingwindow.maximumconsecutiveones;

import main.java.com.gaganbelgur.dsa.slidingwindow.maximumconsecutiveones.MaximumConsecutiveLongestOneSolverInterface;
import main.java.com.gaganbelgur.dsa.slidingwindow.maximumconsecutiveones.MaximumConsecutiveLongestOneSolverOptimized;

public class MaximumConsecutiveLongestOneSolverOptimizedTest extends BaseMaximumConsecutiveLongestOneSolverTest {

    private MaximumConsecutiveLongestOneSolverInterface solver = new MaximumConsecutiveLongestOneSolverOptimized();

    @Override
    protected MaximumConsecutiveLongestOneSolverInterface getSolver() {
        return solver;
    }
}
