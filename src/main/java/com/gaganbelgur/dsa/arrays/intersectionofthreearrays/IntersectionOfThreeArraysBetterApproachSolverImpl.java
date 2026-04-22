package main.java.com.gaganbelgur.dsa.arrays.intersectionofthreearrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IntersectionOfThreeArraysBetterApproachSolverImpl implements IntersectionOfThreeArraysSolverInterface {
    @Override
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> result = new ArrayList<>();

        for (int element : arr1) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            }
        }

        for (int element : arr2) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            }
        }

        for (int element : arr3) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 3) result.add(entry.getKey());
        }

        return result;
    }
}
