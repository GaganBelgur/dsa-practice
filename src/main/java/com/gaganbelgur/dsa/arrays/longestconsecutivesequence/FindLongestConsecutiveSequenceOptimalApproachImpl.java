package main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;

public class FindLongestConsecutiveSequenceOptimalApproachImpl implements FindLongestConsecutiveSequenceInterface {

    @Override
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 1;


        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int currentElement = num;

                while (set.contains(currentElement + 1)) {
                    currentElement += 1;
                    count += 1;
                }

                longest = Math.max(longest, count);
            }
        }


        return longest;
    }
}
