package main.java.com.gaganbelgur.dsa.binarysearch.fixedpoint;

/*
Given an array of distinct integers arr, where arr is sorted in ascending order, return the smallest index i that satisfies arr[i] == i.
If there is no such index, return -1.

Example 1
Input: arr = [-8, -3, 2, 5, 9]
Output: 2
Explanation: arr[2] = 2, thus the output is 2.
*/

public interface FixedPointSolverInterface {

    int fixedPoint(int[] arr);

}
