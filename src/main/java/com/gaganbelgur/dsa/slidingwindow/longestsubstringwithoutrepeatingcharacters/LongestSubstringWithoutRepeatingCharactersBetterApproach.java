package main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersBetterApproach implements LongestSubstringWithoutRepeatingCharactersSolverInterface {
    @Override
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
