package main.java.com.gaganbelgur.dsa.binarysearch.searchelementinonedimensionarray;

public class SearchElementInOneDimensionSolverImpl implements SearchElementInOneDimensionSolverInterface {
    @Override
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (nums[mid] == target) return mid;

            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
