package main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharactersOptimalApproach implements LongestSubstringWithoutRepeatingCharactersSolverInterface {
    @Override
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256];
        Arrays.fill(lastSeen, -1);

        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // if character seen in current window
            if (lastSeen[c] >= left) {
                left = lastSeen[c] + 1;
            }

            lastSeen[c] = right;
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
