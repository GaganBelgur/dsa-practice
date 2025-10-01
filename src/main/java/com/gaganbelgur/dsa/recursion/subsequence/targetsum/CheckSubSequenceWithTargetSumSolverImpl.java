package main.java.com.gaganbelgur.dsa.recursion.subsequence.targetsum;

public class CheckSubSequenceWithTargetSumSolverImpl implements CheckSubSequenceWithTargetSumSolver {

    @Override
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return subsequencesCountWithTargetSum(nums, k, 0, 0);
    }

    private boolean subsequencesCountWithTargetSum(int[] nums, int k, int index, int sum) {
        if(index == nums.length) {
            return k == sum;
        }

        sum += nums[index];
        if(subsequencesCountWithTargetSum(nums, k, index + 1, sum)) return true;

        sum -= nums[index];
        return subsequencesCountWithTargetSum(nums, k, index + 1, sum);
    }
}
