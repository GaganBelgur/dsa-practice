package main.java.com.gaganbelgur.dsa.recursion.subsequence.targetsum;

public class CountSubSequenceWithTargetSumSolverImpl implements CountSubSequenceWithTargetSumSolver {

    @Override
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return subsequencesCountWithTargetSum(nums, k, 0, 0);
    }

    private int subsequencesCountWithTargetSum(int[] nums, int k, int index, int sum) {
        if(index == nums.length) {
            if(k == sum) {
                return 1;
            } else {
                return 0;
            }
        }

        sum += nums[index];
        int left = subsequencesCountWithTargetSum(nums, k, index + 1, sum);

        sum -= nums[index];
        int right = subsequencesCountWithTargetSum(nums, k, index + 1, sum);

        return left + right;
    }
}
