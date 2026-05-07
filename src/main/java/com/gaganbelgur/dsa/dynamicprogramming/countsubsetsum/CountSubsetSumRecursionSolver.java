package main.java.com.gaganbelgur.dsa.dynamicprogramming.countsubsetsum;

public class CountSubsetSumRecursionSolver implements CountSubsetSumSolverInterface {
    @Override
    public int perfectSum(int[] arr, int K) {
        return findWays(arr, K, arr.length - 1);
    }

    private int findWays(int[] arr, int target, int index) {
        if(target == 0) return 1;
        if(index == 0) return (arr[index] == target) ? 1 : 0;

        int notPick = findWays(arr, target, index - 1);
        int pick = 0;
        if (target >= arr[index]) {
            pick = findWays(arr, target - arr[index], index - 1);
        }
        return notPick + pick;
    }
}
