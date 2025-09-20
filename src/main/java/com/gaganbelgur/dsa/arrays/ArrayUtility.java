package main.java.com.gaganbelgur.dsa.arrays;

public class ArrayUtility {

    private void reverseArray(int[] inputArray, int n) {
        int left = 0;
        int right = n - 1;

        while(left < right) {
            int temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;
            left++;
            right--;
        }
    }

    public void reverseArray(int[] inputArray) {
        int n = inputArray.length;
        if(n <= 1) return;
        reverseArray(inputArray, n);
    }
}

