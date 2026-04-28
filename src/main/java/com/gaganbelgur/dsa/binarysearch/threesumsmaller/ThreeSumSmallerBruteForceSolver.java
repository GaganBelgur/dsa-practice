package main.java.com.gaganbelgur.dsa.binarysearch.threesumsmaller;

public class ThreeSumSmallerBruteForceSolver implements ThreeSumSmallerSolverInterface {

    @Override
    public int threeSumSmaller(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum < target) count+=1;
                }
            }
        }

        return count;
    }
}
