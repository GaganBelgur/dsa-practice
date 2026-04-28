package main.java.com.gaganbelgur.dsa.binarysearch.threesumsmaller;

/*
Given an array of n integers nums and an integer target.

Find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the
condition nums[i] + nums[j] + nums[k] < target.


Example 1
Input: nums = [-2,0,1,3], target = 2
Output: 2

Explanation:
Because there are two triplets which sums are less than 2:
[-2,0,1]
[-2,0,3]
*/
public interface ThreeSumSmallerSolverInterface {

    int threeSumSmaller(int[] nums, int target);
}
