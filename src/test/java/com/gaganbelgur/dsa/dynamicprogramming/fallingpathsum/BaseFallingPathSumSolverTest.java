package test.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.fallingpathsum.FallingPathSumSolverInterface;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class BaseFallingPathSumSolverTest {

    protected abstract FallingPathSumSolverInterface getSolver();

    @Test
    public void GivenValidMatrixWhenMinFallingPathSumIsInvokedThenNonNegativeResultShouldBeReceived() {
        int[][] matrix = {
                {1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}
        };
        assertEquals(6, getSolver().minFallingPathSum(matrix));
    }

    @Test
    public void GivenMatrixWithNegativeElementsWhenMinFallingPathSumIsInvokedThenNegativeResultShouldBeReceived() {
        int[][] matrix = {
                {1, 4, 3, 1},
                {2, 3, -1, -1},
                {1, 1, -1, 8}
        };
        assertEquals(-1, getSolver().minFallingPathSum(matrix));
    }

    @Test
    public void GivenEmptyMatrixWhenMinFallingPathSumIsInvokedThenNegativeResultShouldBeReceived() {
        int[][] matrix = {};
        assertEquals(-1, getSolver().minFallingPathSum(matrix));
    }

    @Test
    public void GivenSingleRowMatrixWhenMinFallingPathSumIsInvokedThenNonNegativeResultShouldBeReceived() {
        int[][] matrix = {{3, 5, 7}};
        assertEquals(3, getSolver().minFallingPathSum(matrix));
    }

    @Test
    public void GivenSingleColumnMatrixWhenMinFallingPathSumIsInvokedThenNonNegativeResultShouldBeReceived() {
        int[][] matrix = {{3}, {5}, {7}};
        assertEquals(15, getSolver().minFallingPathSum(matrix));
    }
}
