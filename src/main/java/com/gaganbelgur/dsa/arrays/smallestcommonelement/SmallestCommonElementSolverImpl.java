package main.java.com.gaganbelgur.dsa.arrays.smallestcommonelement;

import java.util.HashMap;
import java.util.Map;

public class SmallestCommonElementSolverImpl implements SmallestCommonElementSolverInterface {

    @Override
    public int smallestCommonElement(int[][] mat) {
        int rows = mat.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : mat[0]) {
            map.put(num, 1);
        }

        for (int i=1; i< mat.length; i++) {
            for (int num : mat[i]) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                }
            }
        }

        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == rows) {
                result = Math.min(result, entry.getKey());
            }
        }

        return (result == Integer.MAX_VALUE) ? -1 : result;
    }

}
