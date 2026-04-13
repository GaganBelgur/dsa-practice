package main.java.com.gaganbelgur.dsa.binarysearch.searchinsertposition;

public class SearchInsertPositionOptimalApproachSolverImpl implements SearchInsertPositionSolverInterface {

    @Override
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(n == 0) return 1;

        int low = 0;
        int high = n-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;

            if(target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }

        return low;
    }
}
