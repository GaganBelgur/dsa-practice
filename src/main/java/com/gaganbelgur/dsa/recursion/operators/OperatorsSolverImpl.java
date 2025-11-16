package main.java.com.gaganbelgur.dsa.recursion.operators;

import java.util.ArrayList;
import java.util.List;

public class OperatorsSolverImpl implements OperatorsSolverInterface {

    @Override
    public java.util.List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<String>();
        operators(result, "", num, target, 0, 0, 0);
        return result;
    }

    private void operators(List<String> result, String path, String num, int target, int index, long value, long last) {
        if (index == num.length()) {
            if (value == target) {
                result.add(path);
                return;
            }
        }

        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;

            long curr = Long.parseLong(num.substring(index, i + 1));

            if (index == 0) {
                operators(result, path + curr, num, target, i + 1, curr, curr);
            } else {
                operators(result, path + "+" + curr, num, target, i + 1, value + curr, curr);

                operators(result, path + "-" + curr, num, target, i + 1, value - curr, -curr);

                operators(result, path + "*" + curr, num, target, i + 1, value - last + last * curr, last * curr);
            }
        }
    }
}
