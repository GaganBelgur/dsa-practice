package main.java.com.gaganbelgur.dsa.arrays.largestsum;

public class LargestSumKadaneSolverImpl implements LargestSumSolverInterface {

    @Override
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int sum = nums[0];

        for(int i=1;i<n;i++) {
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        LargestSumSolverInterface sumSolverInterface = new LargestSumKadaneSolverImpl();
        int max = sumSolverInterface.maxSubArray(new int[]{2, 3, 5, -2, 7, -4});
        System.out.println(max);
    }
}
