package main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence;

/*
 * This is a brute-force approach to find the longest consecutive sequence.
 * We iterate through each element in the array and determine whether it can be the starting point of a sequence.
 * For each potential starting point, we keep counting consecutive numbers by checking the presence of the next elements.
 */
public class FindLongestConsecutiveSequenceInterfaceBruteForceImpl implements FindLongestConsecutiveSequenceInterface {
    @Override
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        int n = nums.length;
        int longest = 0;

        for (int j : nums) {
            int num = j;

            int count = 1;

            while (isNextNumberPresent(nums, n, num + 1)) {
                count++;
                num += 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    private boolean isNextNumberPresent(int[] nums, int n, int nextNumber) {
        for(int i=0; i<n; i++) {
            if(nums[i] == nextNumber) return true;
        }
        return false;
    }
}
