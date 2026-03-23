package main.java.com.gaganbelgur.dsa.arrays.largestsum;

public class LargestSumBruteForceSolverImpl implements LargestSumSolverInterface {

    @Override
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;

        for (int i=0; i<n; i++) {
            int sum = 0;

            for(int j=i; j<n; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LargestSumSolverInterface sumSolverInterface = new LargestSumBruteForceSolverImpl();
        int max = sumSolverInterface.maxSubArray(new int[]{2, 3, 5, -2, 7, -4});
        System.out.println(max);
    }
}
