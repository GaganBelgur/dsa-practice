package test.java.com.gaganbelgur.arrays;

import main.java.com.gaganbelgur.dsa.arrays.ArrayUtility;
import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilityTest {

    ArrayUtility arrayUtility = new ArrayUtility();

    @Test
    public void testEmptyInput() {
        int[] emptyInput = {};
        int[] expected = {};

        arrayUtility.reverseArray(emptyInput);

        Assert.assertArrayEquals(expected, emptyInput);
    }

    @Test
    public void testSingleElement() {
        int[] singleElementInput = {1};
        int[] expected = {1};

        arrayUtility.reverseArray(singleElementInput);

        Assert.assertArrayEquals(expected, singleElementInput);
    }

    @Test
    public void testDuplicateElement() {
        int[] duplicateElement = {1, 2, 2};
        int[] expected = {2, 2, 1};

        arrayUtility.reverseArray(duplicateElement);

        Assert.assertArrayEquals(expected, duplicateElement);
    }

    @Test
    public void testReverseDescendingElement() {
        int[] descendingOrderedInput = {3, 2, 1};
        int[] expected = {1, 2, 3};

        arrayUtility.reverseArray(descendingOrderedInput);

        Assert.assertArrayEquals(expected, descendingOrderedInput);
    }

    @Test
    public void testNegativeNumberedElement() {
        int[] negativeNumberedInput = {-1, -2, -3};
        int[] expected = {-3, -2, -1};

        arrayUtility.reverseArray(negativeNumberedInput);

        Assert.assertArrayEquals(expected, negativeNumberedInput);
    }

    @Test
    public void testMixedNumbers() {
        int[] mixedInput = {10, -5, 0, 7};
        int[] expected = {7, 0, -5, 10};

        arrayUtility.reverseArray(mixedInput);

        Assert.assertArrayEquals(expected, mixedInput);
    }

    @Test
    public void testReverseSubArrayNumbers() {
        int[] mixedInput = {1, 2, 3, 4};
        int[] expected = {1, 3, 2, 4};

        arrayUtility.reverseSubArray(mixedInput, 1, 2);

        Assert.assertArrayEquals(expected, mixedInput);
    }
}
