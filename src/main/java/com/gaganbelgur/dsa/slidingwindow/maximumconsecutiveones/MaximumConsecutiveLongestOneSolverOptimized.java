package main.java.com.gaganbelgur.dsa.slidingwindow.maximumconsecutiveones;

public class MaximumConsecutiveLongestOneSolverOptimized implements MaximumConsecutiveLongestOneSolverInterface {
    @Override
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        if(n == 0) return -1;
        return getLongestOnesAtMostKZeroFlips(nums, k, n);
    }

    private int getLongestOnesAtMostKZeroFlips(int[] nums, int k, int n) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroCount = 0;

        while(right < n) {
            if(nums[right] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
