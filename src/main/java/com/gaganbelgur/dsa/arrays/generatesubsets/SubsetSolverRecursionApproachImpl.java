package main.java.com.gaganbelgur.dsa.arrays.generatesubsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetSolverRecursionApproachImpl implements SubsetSolverInterface {
    @Override
    public List<List<Integer>> findSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        subsets(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private void subsets(int[] arr, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for(int i = start; i< arr.length; i++) {
            current.add(arr[i]);
            subsets(arr, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubsetSolverInterface subsetSolverInterface = new SubsetSolverRecursionApproachImpl();
        List<List<Integer>> result = subsetSolverInterface.findSubsets(new int[]{1, 2});
        System.out.println(result);
    }
}
