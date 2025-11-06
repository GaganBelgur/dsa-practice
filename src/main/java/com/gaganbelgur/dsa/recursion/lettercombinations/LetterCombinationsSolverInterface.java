package main.java.com.gaganbelgur.dsa.recursion.lettercombinations;

import java.util.List;

public interface LetterCombinationsSolverInterface {

    String[] combos = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    List<String> letterCombinations(String digits);

}
