package main.java.com.gaganbelgur.dsa.dynamicprogramming.countpartitions;

/*
Given an
array arr of n integers and an
integer diff,

count the number of ways to partition the array
into two subsets S1 and S2 such that:

∣S1−S2∣ = diff and S1 ≥ S2
Where |S1| and |S2| are sum of Subsets S1 and S2 respectively.


Return the result modulo 109 + 7.

Note: A partition means that the union of S1 and S2 is the original array,
and no element is left out or used twice
every element of the array belongs to exactly one of the two subsets.
*/
public interface CountPartitionsSolverInterface {
    int countPartitions(int n, int diff, int[] arr);
}
