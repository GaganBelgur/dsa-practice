package main.java.com.gaganbelgur.dsa.binarysearch.largeintegerindex;

/*
Given an integer array arr, where all the integers in arr are equal except for one integer which is larger than the rest of the integers.

There is no direct access to the array. Instead, there is an API ArrayReader with the following functions:

1. int compareSub(int l, int r, int x, int y): Compares the sum of the
    sub-array arr[l..r] with the sum of the sub-array arr[x..y] and returns:

    1 if sum(arr[l..r]) > sum(arr[x..y]),
    0 if sum(arr[l..r]) == sum(arr[x..y]) and
    -1 if sum(arr[l..r]) < sum(arr[x..y]).

2. int length(): Returns the length of the array.

The call to compareSub() can be made at most 20 times. Both functions work in O(1) time.
The task is to return the index of the array arr which has the largest integer.

Example 1
Input: arr = [7, 7, 7, 10, 7, 7, 7]
Output: 3

Explanation:
The array has 7 elements, with the largest integer 10 at index 3. By dividing the array and using the compareSub function,
we can determine which half contains the larger integer and recursively narrow down to find its exact index.
*/
public interface LargeIntegerIndexSolverInterface {

    int getIndex(ArrayReader reader);
}
