package main.java.com.gaganbelgur.dsa.slidingwindow.maxslidingwindow;

public class MaxSlidingWindowSolverBruteForce implements MaxSlidingWindowSolverInterface {

    @Override
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        return maxSlidingWindow(arr, k, n);
    }

    private int[] maxSlidingWindow(int[] arr, int k, int n) {
        int[] result = new int[n];

        int index = 0;
        int left = 0;
        int right = 0;

        while(right < n) {
            if((right - left + 1) == k) {
                int max = Integer.MIN_VALUE;
                for(int i = left; i<= right; i++) {
                    max = Math.max(max, arr[i]);
                }
                result[index++] = max;
                left++;
            }
            right++;
        }

        int[] temp = new int[index];
        System.arraycopy(result, 0, temp, 0, index);
        return temp;
    }


}
