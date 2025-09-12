package main.java.com.gaganbelgur.dsa.slidingwindow.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSolverBruteForce implements LongestNonRepeatingSubStringCharacterSolverInterface {

    @Override
    public int longestNonRepeatingSubstring(String s) {
        if(s.isEmpty()) return 0;
        return calculateLongestNonRepeatingSubstring(s);
    }

    private int calculateLongestNonRepeatingSubstring(String str) {
        int n = str.length();
        int maxLen = 0;

        for(int i=0;i<n;i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i; j<n;j++) {
                if(set.contains(str.charAt(j))) {
                    maxLen = Math.max(maxLen, j-i);
                    break;
                }

                set.add(str.charAt(j));
            }
        }

        return maxLen;
    }
}
