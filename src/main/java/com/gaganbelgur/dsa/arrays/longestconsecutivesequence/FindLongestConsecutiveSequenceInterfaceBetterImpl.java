package main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence;

import java.util.Arrays;

public class FindLongestConsecutiveSequenceInterfaceBetterImpl implements FindLongestConsecutiveSequenceInterface {

    @Override
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 0;
        int lastSmallestNumber = Integer.MIN_VALUE;
        int count = 0;

        for (int num : nums) {
            if (num - 1 == lastSmallestNumber) {
                count += 1;
                lastSmallestNumber = num;
            } else if (num != lastSmallestNumber) {
                count = 1;
                lastSmallestNumber = num;
            }

            longest = Math.max(count, longest);
        }

        return longest;
    }
}
