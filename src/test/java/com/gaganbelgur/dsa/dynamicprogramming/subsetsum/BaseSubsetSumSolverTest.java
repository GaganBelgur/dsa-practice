package test.java.com.gaganbelgur.dsa.dynamicprogramming.subsetsum;

import main.java.com.gaganbelgur.dsa.dynamicprogramming.subset.SubsetSumSolverInterface;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public abstract class BaseSubsetSumSolverTest {

    protected abstract SubsetSumSolverInterface getSolver();

    @Test
    public void GivenValidArrayWhenCheckIsSubsetHasPresentMethodIsInvokedThenTrueValueIsReturned() {
        int[] array = {2, 3, 1, 2};

        assertTrue(getSolver().isSubsetSumPresent(array, 5));
    }

    @Test
    public void GivenValidArrayAndTarget0WhenCheckIsSubsetHasPresentMethodIsInvokedThenTrueValueIsReturned() {
        int[] array = {2, 3, 1, 2};

        assertTrue(getSolver().isSubsetSumPresent(array, 0));
    }
}
