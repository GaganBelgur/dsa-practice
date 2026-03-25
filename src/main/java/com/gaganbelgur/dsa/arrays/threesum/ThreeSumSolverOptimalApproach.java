package main.java.com.gaganbelgur.dsa.arrays.threesum;

import java.util.*;

public class ThreeSumSolverOptimalApproach implements ThreeSumSolverInterface {

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return threeSum(nums, n);
    }

    private List<List<Integer>> threeSum(int[] nums, int n) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
