package main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstringatmostdistincts;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostDistinctSolverBruteForce {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.isEmpty()) return 0;

        return lengthOfLongestSubstringTwoDistinct(s, s.length());
    }

    private int lengthOfLongestSubstringTwoDistinct(String s, int n) {
        if (s.isEmpty()) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < n) {
            Character currentCharacter = s.charAt(right);
            int currentCharacterCount = map.getOrDefault(currentCharacter, -1);

            if (currentCharacterCount == -1) {
                map.put(currentCharacter, 1);
            } else {
                map.put(currentCharacter, currentCharacterCount + 1);
            }

            while (map.size() > 2) {
                Character leftCharacter = s.charAt(left);
                int leftCharacterCount = map.getOrDefault(leftCharacter, 0);
                map.put(leftCharacter, leftCharacterCount - 1);

                if (leftCharacterCount - 1 == 0) {
                    map.remove(leftCharacter);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

}
