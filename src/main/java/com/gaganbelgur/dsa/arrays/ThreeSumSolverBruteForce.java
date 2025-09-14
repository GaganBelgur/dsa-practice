package main.java.com.gaganbelgur.dsa.arrays;

import java.util.*;

public class ThreeSumSolverBruteForce implements ThreeSumSolverInterface {

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return threeSum(nums, n);
    }

    private List<List<Integer>> threeSum(int[] nums, int n) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        result.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
