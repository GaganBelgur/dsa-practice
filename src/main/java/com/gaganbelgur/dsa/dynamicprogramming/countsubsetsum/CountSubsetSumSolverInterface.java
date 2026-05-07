package main.java.com.gaganbelgur.dsa.dynamicprogramming.countsubsetsum;

/*Given an array arr of n integers and an integer K,
count the number of subsets of the given array that have a sum equal to K.
Return the result modulo (109 + 7).

Example 1

Input: arr = [2, 3, 5, 16, 8, 10], K = 10
Output: 3

Explanation: The subsets are [2, 8], [10], and [2, 3, 5].
*/
public interface CountSubsetSumSolverInterface {

    int perfectSum(int[] arr, int K);
}
