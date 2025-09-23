package main.java.com.gaganbelgur.dsa.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequenceSolverRecursiveApproach implements GenerateSubsequenceSolverInterface {

    @Override
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, result);
    }
}
