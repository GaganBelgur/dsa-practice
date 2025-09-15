package main.java.com.gaganbelgur.dsa.arrays.majorityelement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwoSolverOptimized implements MajorityElementTwoSolverInterface {

    @Override
    public List<Integer> majorityElementTwo(int[] nums) {
        int n = nums.length;
        if(n == 0) return new ArrayList<>();

        int targetFrequency = n / 3;
        return majorityElementTwo(nums, targetFrequency);
    }

    private List<Integer> majorityElementTwo(int[] nums, int targetFrequency) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequencyValue = entry.getValue();
            if (frequencyValue > targetFrequency) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
