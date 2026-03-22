package main.java.com.gaganbelgur;

import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterface;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterfaceBetterImpl;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterfaceBruteForceImpl;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceOptimalApproachImpl;
import main.java.com.gaganbelgur.dsa.sorting.MergeSort;
import main.java.com.gaganbelgur.dsa.sorting.QuickSort;
import main.java.com.gaganbelgur.dsa.sorting.SortInterface;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        SortInterface mergeSort = new MergeSort();
        int[] mergeSortInputArray = {4, 3, 9, 1};
        mergeSort.sort(mergeSortInputArray);
        System.out.println(Arrays.toString(mergeSortInputArray));

        SortInterface quickSort = new QuickSort();
        int[] quickSortInputArray = {4, 3, 9, 1};
        quickSort.sort(quickSortInputArray);
        System.out.println(Arrays.toString(quickSortInputArray));

        findLongestConsecutiveSequence(new FindLongestConsecutiveSequenceInterfaceBruteForceImpl());
        findLongestConsecutiveSequence(new FindLongestConsecutiveSequenceInterfaceBetterImpl());
        findLongestConsecutiveSequence(new FindLongestConsecutiveSequenceOptimalApproachImpl());
    }

    private static void findLongestConsecutiveSequence(FindLongestConsecutiveSequenceInterface findLongestConsecutiveSequenceInterface) {
        int[] inputArray = {100, 4, 200, 1, 3, 2};
        int result = findLongestConsecutiveSequenceInterface.longestConsecutive(inputArray);
        System.out.println(result);
    }
}
