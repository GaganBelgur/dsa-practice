package main.java.com.gaganbelgur.dsa.recursion.subsequence.generate;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequenceSolverOptimizedRecursiveApproach implements GenerateSubsequenceSolverInterface {

    @Override
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }
    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
         result.add(new ArrayList<>(current));

         for (int i = index; i < nums.length; i++) {
           current.add(nums[i]);
           generateSubsets(nums, i + 1, current, result);
           current.remove(current.size() - 1);
         }
    }
}
