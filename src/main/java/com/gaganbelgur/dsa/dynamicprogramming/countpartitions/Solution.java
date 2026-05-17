package main.java.com.gaganbelgur.dsa.dynamicprogramming.countpartitions;

public class Solution {
    public static void main(String[] args) {
        execute(new CountPartitionsRecursionSolver());
        execute(new CountPartitionsMemorizationSolver());
    }

    private static void execute(CountPartitionsSolverInterface solver) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;
        int result = solver.countPartitions(arr.length, diff, arr);
        System.out.println(result == 3);
    }
}
