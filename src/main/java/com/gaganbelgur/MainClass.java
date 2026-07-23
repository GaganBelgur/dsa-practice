package main.java.com.gaganbelgur;

import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterface;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterfaceBetterImpl;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterfaceBruteForceImpl;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceOptimalApproachImpl;
import main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers.CountGoodNumbersProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers.CountGoodNumbersSolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.sortstack.SortStackProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.sortstack.SortStackSolverImpl;
import main.java.com.gaganbelgur.dsa.sorting.*;

import java.util.Arrays;
import java.util.Stack;

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

        SortInterface bubbleSort = new BubbleSort();
        int[] bubbleSortInputArray = {4, 3, 9, 1};
        bubbleSort.sort(bubbleSortInputArray);
        System.out.println(Arrays.toString(bubbleSortInputArray));

        SortInterface insertionSort = new InsertionSort();
        int[] insertionSortInputArray = {6,5,4,3,2,1};
        insertionSort.sort(insertionSortInputArray);
        System.out.println(Arrays.toString(insertionSortInputArray));

        findLongestConsecutiveSequence(new FindLongestConsecutiveSequenceInterfaceBruteForceImpl());
        findLongestConsecutiveSequence(new FindLongestConsecutiveSequenceInterfaceBetterImpl());
        findLongestConsecutiveSequence(new FindLongestConsecutiveSequenceOptimalApproachImpl());

        CountGoodNumbersProblemSolverInterface goodNumbersProblemSolverInterface = new CountGoodNumbersSolverImpl();
        int result = goodNumbersProblemSolverInterface.countGoodNumbers(22);
        System.out.println("Count Good Number = " + result);

        SortStackProblemSolverInterface sortStack = new SortStackSolverImpl();
        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(3);

        System.out.println("Before Sorting: "  + stack);
        sortStack.sort(stack);
        System.out.println("After Sorting: "  + stack);
    }

    private static void findLongestConsecutiveSequence(FindLongestConsecutiveSequenceInterface findLongestConsecutiveSequenceInterface) {
        int[] inputArray = {100, 4, 200, 1, 3, 2};
        int result = findLongestConsecutiveSequenceInterface.longestConsecutive(inputArray);
        System.out.println(result);
    }
}
