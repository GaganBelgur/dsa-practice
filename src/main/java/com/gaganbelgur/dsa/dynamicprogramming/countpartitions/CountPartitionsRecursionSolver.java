package main.java.com.gaganbelgur.dsa.dynamicprogramming.countpartitions;

public class CountPartitionsRecursionSolver implements CountPartitionsSolverInterface {
    @Override
    public int countPartitions(int n, int diff, int[] arr) {
        int totalSum = 0;
        for (int num : arr) totalSum += num;

        int result = totalSum - diff;
        if (result < 0) return 0;
        if (result % 2 == 1) return 0;

        int s2 = result / 2;

        return findPartitionsCount(n - 1, s2, arr);
    }

    private int findPartitionsCount(int index, int sum, int[] arr) {
        if (index == 0) {
            if (sum == 0 && arr[0] == 0) return 2;
            if (sum == 0 || arr[0] == sum) return 1;
            return 0;
        }

        int notPick = findPartitionsCount(index - 1, sum, arr);

        int pick = 0;
        if (arr[index] <= sum) {
            pick = findPartitionsCount(index - 1, sum - arr[index], arr);
        }

        return (pick + notPick) % ((int) (1e9) + 7);
    }
}
