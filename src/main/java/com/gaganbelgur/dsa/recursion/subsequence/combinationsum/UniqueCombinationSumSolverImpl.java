package main.java.com.gaganbelgur.dsa.recursion.subsequence.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Combination - II
public class UniqueCombinationSumSolverImpl implements CombinationSumSolverInterface {

    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        generateSubSequence(candidates, 0, target, new ArrayList<Integer>(), result);
        return result;
    }

    private void generateSubSequence(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index; i<candidates.length;i++) {
            if(i > index && candidates[i] == candidates[i - 1]) continue;

            if(candidates[i]> target) break;
            current.add(candidates[i]);
            generateSubSequence(candidates, i+1, target-candidates[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}
