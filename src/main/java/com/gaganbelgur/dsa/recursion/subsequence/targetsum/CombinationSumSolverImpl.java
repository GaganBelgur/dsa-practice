package main.java.com.gaganbelgur.dsa.recursion.subsequence.targetsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumSolverImpl implements CombinationSumSolver {

    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findCombinationSum(candidates, target, result, 0, list);
        return result;
    }

    private void findCombinationSum(int[] candidates, int target, List<List<Integer>> result, int index, List<Integer> list) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (index >= candidates.length || target < 0) return;

        list.add(candidates[index]);
        findCombinationSum(candidates, target - candidates[index], result, index, list);

        list.remove(list.size() - 1);
        findCombinationSum(candidates, target, result, index + 1, list);
    }
}
