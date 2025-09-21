package main.java.com.gaganbelgur.dsa.binarysearch.searchelementonedimension;

public class SearchElementInOneDimensionArraySolver implements SearchElementInOneDimensionArraySolverInterface {

    @Override
    public int search(int[] nums, int target) {
        if (nums.length < 1) return -1;

        int n = nums.length;
        return searchInternal(nums, n, target);
    }

    private int searchInternal(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) return mid;

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

}
