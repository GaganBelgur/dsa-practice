package main.java.com.gaganbelgur.dsa.recursion.lettercombinations;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsSolverImpl implements LetterCombinationsSolverInterface {

    @Override
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty()) return result;

        findCombinations(0, "", digits, result);
        return result;
    }

    private void findCombinations(int index, String s, String digits, List<String> result) {
        if(index == digits.length()) {
            result.add(s);
            return;
        }

        String number = combos[digits.charAt(index) - '0'];

        for(int i=0; i<number.length(); i++) {
            findCombinations(index + 1, s + number.charAt(i), digits, result);
        }
    }
}
