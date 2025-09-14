package main.java.com.gaganbelgur.dsa.slidingwindow.minimumwidowsubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringSolverBruteForce implements MinimumWindowSubstringSolverInterface {

    @Override
    public String minWindow(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength == 0 || tLength == 0 || sLength < tLength) return "";

        return minWindow(s, t, sLength, tLength);
    }

    private String minWindow(String s, String t, int sLength, int tLength) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (Character windowCharacter : t.toCharArray()) {
            windowMap.put(windowCharacter, windowMap.getOrDefault(windowCharacter, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int have = 0;
        int need = windowMap.size();
        int left = 0;
        int right = 0;
        int start = 0;

        while (right < sLength) {
            Character currentCharacter = s.charAt(right);
            frequencyMap.put(currentCharacter, frequencyMap.getOrDefault(currentCharacter, 0) + 1);

            if (windowMap.containsKey(currentCharacter) && frequencyMap.get(currentCharacter).intValue() == windowMap.get(currentCharacter).intValue()) {
                have++;
            }

            while (have == need) {
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                Character leftCharacter = s.charAt(left);
                frequencyMap.put(leftCharacter, frequencyMap.get(leftCharacter) - 1);

                if (windowMap.containsKey(leftCharacter)
                        && frequencyMap.get(leftCharacter) < windowMap.get(leftCharacter)) {
                    have--;
                }
                left++;
            }

            right++;
        }

        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLen);
    }
}
