package main.java.com.gaganbelgur.dsa.binarysearch.searchinsertposition;

public class SearchInsertPositionBruteForceApproachSolverImpl implements SearchInsertPositionSolverInterface {
    @Override
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
