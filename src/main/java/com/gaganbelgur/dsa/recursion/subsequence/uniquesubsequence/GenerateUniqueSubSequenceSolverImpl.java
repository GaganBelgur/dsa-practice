package main.java.com.gaganbelgur.dsa.recursion.subsequence.uniquesubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateUniqueSubSequenceSolverImpl implements GenerateUniqueSubSequenceSolverInterface {

    @Override
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        generateSubSequence(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubSequence(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            generateSubSequence(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
