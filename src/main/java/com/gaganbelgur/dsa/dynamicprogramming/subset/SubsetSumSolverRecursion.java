package main.java.com.gaganbelgur.dsa.dynamicprogramming.subset;

public class SubsetSumSolverRecursion implements SubsetSumSolverInterface {

    @Override
    public boolean isSubsetSumPresent(int[] arr, int target) {
        return isSubsetPresent(arr, arr.length - 1, target);
    }

    private boolean isSubsetPresent(int[] arr, int index, int target) {
        if (target == 0) return true;
        if (index == 0) return arr[index] == target;

        boolean notTake = isSubsetPresent(arr, index - 1, target);
        boolean take = false;

        if (target >= arr[index]) {
            take = isSubsetPresent(arr, index - 1, target - arr[index]);
        }

        return take || notTake;
    }
}
