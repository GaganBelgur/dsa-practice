package main.java.com.gaganbelgur.dsa.arrays.maxproduct;

public class MaxProductSubArraySolverImpl implements MaxProductSubArraySolverInterface {

    @Override
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int maxProduct = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int product = nums[i];
            maxProduct = Math.max(maxProduct, product);

            for (int j = i + 1; j < n; j++) {
                product = product * nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
}
