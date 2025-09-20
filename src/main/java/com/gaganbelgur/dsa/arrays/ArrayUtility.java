package main.java.com.gaganbelgur.dsa.arrays;

public class ArrayUtility {

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

    public void reverseArray(int[] inputArray) {
        if(inputArray == null) return;

        int n = inputArray.length;
        if(n <= 1) return;

        reverseArrayInternal(inputArray, 0, n-1);
    }

    public void reverseSubArray(int[] inputArray, int start, int end) {
        if(inputArray == null) return;

        int n = inputArray.length;
        if(n <= 1) return;

        reverseArrayInternal(inputArray, start, end);
    }
}

