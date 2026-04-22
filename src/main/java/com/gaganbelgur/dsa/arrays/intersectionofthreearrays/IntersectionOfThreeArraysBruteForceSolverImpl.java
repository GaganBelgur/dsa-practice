package main.java.com.gaganbelgur.dsa.arrays.intersectionofthreearrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfThreeArraysBruteForceSolverImpl implements IntersectionOfThreeArraysSolverInterface {
    @Override
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int a3 = arr3.length;
        List<Integer> result = new ArrayList<>();

        for (int element : arr1) {
            for (int i : arr2) {
                if (element == i) {
                    for (int j : arr3) {
                        if (element == j) {
                            result.add(element);
                        }
                    }
                }
            }
        }

        return result;
    }
}
