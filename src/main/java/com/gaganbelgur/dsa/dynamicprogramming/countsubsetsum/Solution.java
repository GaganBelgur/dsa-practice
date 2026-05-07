package main.java.com.gaganbelgur.dsa.dynamicprogramming.countsubsetsum;

public class Solution {
    public static void main(String[] args) {
        findSubSet(new CountSubsetSumRecursionSolver());
        findSubSet(new CountSubsetSumMemorizationSolver());
    }

    private static void findSubSet(CountSubsetSumSolverInterface subsetSumSolverInterface) {
        int[] arr = {1, 2, 3, 4};
        int target = 4;
        int result = subsetSumSolverInterface.perfectSum(arr, target);
        System.out.println(result == 2);
    }
}
