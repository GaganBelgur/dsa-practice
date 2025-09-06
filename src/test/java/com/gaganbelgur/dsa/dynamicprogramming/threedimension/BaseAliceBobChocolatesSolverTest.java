package test.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.threedimension.AliceBobChocolatesSolver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class BaseAliceBobChocolatesSolverTest {

    protected abstract AliceBobChocolatesSolver getSolver();

    @Test
    public void GivenValidMatrixWhenCalculateMaxChocolatesMethodIsInvokedThenPositiveValueIsReturned() {
        int[][] matrix = {
                {2, 3, 1, 2},
                {3, 4, 2, 2},
                {5, 6, 3, 5}
        };
        assertEquals(21, getSolver().maxChocolates(matrix));
    }

    @Test
    public void GivenEmptyMatrixWhenCalculateMaxChocolatesMethodIsInvokedThenNegativeResultShouldBeReceived() {
        int[][] matrix = {};
        assertEquals(-1, getSolver().maxChocolates(matrix));
    }

    @Test
    public void GivenSingleRowMatrixWhenCalculateMaxChocolatesMethodIsInvokedThenNonNegativeResultShouldBeReceived() {
        int[][] matrix = {{3, 5, 7}};
        assertEquals(10, getSolver().maxChocolates(matrix));
    }

    @Test
    public void GivenSingleColumnMatrixWhenCalculateMaxChocolatesMethodIsInvokedThenNonNegativeResultShouldBeReceived() {
        int[][] matrix = {{3}, {5}, {7}};
        assertEquals(-1, getSolver().maxChocolates(matrix));
    }
}
