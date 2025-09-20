package main.java.com.gaganbelgur.dsa.arrays;

public class ArrayUtility {

    private void reverseArrayInternal(int[] inputArray, int n) {
        int left = 0;
        int right = n - 1;

        while(left < right) {
            swapElements(inputArray, left, right);
            left++;
            right--;
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

        reverseArrayInternal(inputArray, n);
    }
}

