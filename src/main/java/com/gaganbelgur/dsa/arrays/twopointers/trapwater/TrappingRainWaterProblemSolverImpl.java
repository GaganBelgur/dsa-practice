package main.java.com.gaganbelgur.dsa.arrays.twopointers.trapwater;

public class TrappingRainWaterProblemSolverImpl implements TrappingRainWaterProblemSolverInterface {

    @Override
    public int trap(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int waterAccumulated = 0;

        while(left < right) {
            if(heights[left] < heights[right]) {
                if(heights[left] > leftMax) {
                    leftMax = heights[left];
                } else {
                    waterAccumulated += leftMax - heights[left];
                }
                left++;
            } else {
                if(heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else  {
                    waterAccumulated += rightMax - heights[right];
                }

                right--;
            }
        }

        return waterAccumulated;
    }
}
