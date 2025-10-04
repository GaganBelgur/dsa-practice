package main.java.com.gaganbelgur.dsa.arrays.maxproduct;

public class MaxProductSubArrayOptimizedApproachSolverImpl implements MaxProductSubArraySolverInterface {

    @Override
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        return maxProduct(nums, n);
    }

    private int maxProduct(int[] nums, int n) {
        int maxProduct = nums[0];
        int maximumSoFar = nums[0];
        int minimumSoFar = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];

            if(curr < 0) {
                int temp = maximumSoFar;
                maximumSoFar = minimumSoFar;
                minimumSoFar = temp;
            }

            maximumSoFar = Math.max(curr, maximumSoFar * curr);
            minimumSoFar = Math.min(curr, minimumSoFar * curr);

            maxProduct = Math.max(maxProduct, maximumSoFar);
        }
        return maxProduct;
    }
}
