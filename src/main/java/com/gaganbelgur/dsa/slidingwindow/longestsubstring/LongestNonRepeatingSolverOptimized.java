package main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSolverOptimized implements LongestNonRepeatingSubStringCharacterSolverInterface {

    @Override
    public int longestNonRepeatingSubstring(String s) {
        if(s.isEmpty()) return 0;
        return calculateLongestNonRepeatingSubstring(s);
    }

    private int calculateLongestNonRepeatingSubstring(String str) {
        int n = str.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for(int right = 0; right < n; right++) {
            Character c = str.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}
