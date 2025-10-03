package main.java.com.gaganbelgur.dsa.arrays.longestsubarray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayTargetSumSolverImpl implements LongestSubArrayTargetSumSolverInterface {

    @Override
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return -1;

        return findLongestSubArray(nums, k, n);
    }

    private int findLongestSubArray(int[] nums, int k, int n) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            map.putIfAbsent(sum, i);
        }
        return maxLen;
    }
}
