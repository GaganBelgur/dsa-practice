package main.java.com.gaganbelgur.dsa.arrays;

import main.java.com.gaganbelgur.dsa.utils.InvalidIndexException;

public class ArrayUtility {

    public void reverseArray(int[] inputArray) {
        int n = getInputArrayLength(inputArray);
        if(n <= 1) return;

        reverseArrayInternal(inputArray, 0, n-1);
    }

    public void reverseSubArray(int[] inputArray, int start, int end) throws InvalidIndexException {
        int n = getInputArrayLength(inputArray);
        if(n <= 1) return;
        if(!isValidStartEndIndex(n, start, end)) throw new InvalidIndexException("Invalid Start or End Index");
        reverseArrayInternal(inputArray, start, end);
    }

    public void rotateArray(int[] inputArray, int k) {
        int n = getInputArrayLength(inputArray);
        if(n <= 1) return;

        k = k % n;

        reverseArrayInternal(inputArray, 0, n-1);
        reverseArrayInternal(inputArray, 0, k - 1);
        reverseArrayInternal(inputArray, k, n-1);
    }

    private void reverseArrayInternal(int[] inputArray, int start, int end) {
        while(start < end) {
            swapElements(inputArray, start, end);
            start++;
            end--;
        }
    }

    private void swapElements(int[] inputArray, int left, int right) {
        int temp = inputArray[left];
        inputArray[left] = inputArray[right];
        inputArray[right] = temp;
    }

    private int getInputArrayLength(int[] inputArray) {
        if(inputArray == null) return -1;

        return inputArray.length;
    }

    private boolean isValidStartEndIndex(int n, int start, int end) {
        return start >= 0 && start <= n - 1 && start <= end && end <= n - 1;
    }
}

