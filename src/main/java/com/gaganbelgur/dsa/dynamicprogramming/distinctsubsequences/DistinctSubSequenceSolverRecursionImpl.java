package main.java.com.gaganbelgur.dsa.dynamicprogramming.distinctsubsequences;

public class DistinctSubSequenceSolverRecursionImpl implements DistinctSubSequenceSolverInterface {

    @Override
    public int distinctSubsequences(String s1, String s2) {
        return distinctSubsequences(s1.length() - 1, s2.length() - 1, s1, s2);
    }

    private int distinctSubsequences(int index1, int index2, String s1, String s2) {
        if (index2 < 0) return 1;
        if (index1 < 0) return 0;

        int result;

        if (s1.charAt(index1) == s2.charAt(index2)) {
            int matchedAndConsidered = distinctSubsequences(index1 - 1, index2 - 1, s1, s2);
            int lookingForDifferentMatch = distinctSubsequences(index1 - 1, index2, s1, s2);
            result = matchedAndConsidered + lookingForDifferentMatch;
            result %= prime;
        } else {
            result = distinctSubsequences(index1 - 1, index2, s1, s2);
        }

        return result;
    }
}
