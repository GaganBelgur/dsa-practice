package main.java.com.gaganbelgur;

import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterface;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterfaceBetterImpl;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceInterfaceBruteForceImpl;
import main.java.com.gaganbelgur.dsa.arrays.longestconsecutivesequence.FindLongestConsecutiveSequenceOptimalApproachImpl;
import main.java.com.gaganbelgur.dsa.recursion.atoi.ATOIProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.atoi.ATOISolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers.CountGoodNumbersProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.countgoodnumbers.CountGoodNumbersSolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.generatebinarystrings.BinaryStringsGeneratorProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.generatebinarystrings.BinaryStringsSolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.generateparanthesis.GenerateParenthesisProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.generateparanthesis.GenerateParenthesisSolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.permutation.PermutationProblemSolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.permutation.PermutationProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.reversestack.ReverseStackProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.reversestack.ReverseStackSolverImpl;
import main.java.com.gaganbelgur.dsa.recursion.sortstack.SortStackProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.recursion.sortstack.SortStackSolverImpl;
import main.java.com.gaganbelgur.dsa.sorting.*;
import main.java.com.gaganbelgur.dsa.stackandqueue.parenthesisdepth.ParenthesisDepthBruteForceSolverImpl;
import main.java.com.gaganbelgur.dsa.stackandqueue.parenthesisdepth.ParenthesisDepthOptimalSolverImpl;
import main.java.com.gaganbelgur.dsa.stackandqueue.parenthesisdepth.ParenthesisDepthProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.stackandqueue.queuetostack.ImplementStackUsingQueueImpl;
import main.java.com.gaganbelgur.dsa.stackandqueue.queuetostack.ImplementStackUsingQueueInterface;
import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringBruteForceSolverImpl;
import main.java.com.gaganbelgur.dsa.strings.longestpalindromicsubstring.LongestPalindromicSubStringProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.strings.outerparenthesis.RemoveOuterParenthesisProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.strings.outerparenthesis.RemoveOuterParenthesisSolverImpl;
import main.java.com.gaganbelgur.dsa.strings.romannumerals.RomanNumeralsProblemSolverInterface;
import main.java.com.gaganbelgur.dsa.strings.romannumerals.RomanNumeralsSolverImpl;

import java.util.Arrays;
import java.util.List;
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
        int[] insertionSortInputArray = {6, 5, 4, 3, 2, 1};
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

        System.out.println("Before Sorting: " + stack);
        sortStack.sort(stack);
        System.out.println("After Sorting: " + stack);

        ReverseStackProblemSolverInterface reverseStackProblemSolver = new ReverseStackSolverImpl();
        System.out.println("Before Reversing: " + stack);
        reverseStackProblemSolver.reverse(stack);
        System.out.println("After Reversing: " + stack);

        ATOIProblemSolverInterface atoiProblemSolverInterface = new ATOISolverImpl();
        String inputString = "   -42";
        int resultFromAtoi = atoiProblemSolverInterface.myATOI(inputString);
        System.out.println("Result from ATOI: " + resultFromAtoi);

        BinaryStringsGeneratorProblemSolverInterface binaryStringGenerator = new BinaryStringsSolverImpl();
        int n = 3;
        System.out.println("Binary Strings of length " + n + ":");
        List<String> binaryStrings = binaryStringGenerator.generateBinaryStrings(n);
        for (String s : binaryStrings) {
            System.out.println(s);
        }

        PermutationProblemSolverInterface permutation = new PermutationProblemSolverImpl();
        int[] input = {2,4,6};
        List<List<Integer>> permutationResult = permutation.permute(input);
        System.out.println(permutationResult);

        GenerateParenthesisProblemSolverInterface generateParenthesis = new GenerateParenthesisSolverImpl();
        List<String> parenthesisResult = generateParenthesis.generateParenthesis(2);
        System.out.println(parenthesisResult);

        ImplementStackUsingQueueInterface stackQueue = new ImplementStackUsingQueueImpl();
        stackQueue.push(2);
        stackQueue.push(4);
        stackQueue.push(1);
        stackQueue.push(3);
        stackQueue.push(6);

        System.out.println("Stack Queue: " + stackQueue.top());

        ParenthesisDepthProblemSolverInterface parenthesisDepthProblemSolver = new ParenthesisDepthBruteForceSolverImpl();
        String parenthesisInput = "((()))";
        int depth = parenthesisDepthProblemSolver.maxDepth(parenthesisInput);
        System.out.println("Max Depth of Parenthesis brute force: " + depth);

        parenthesisDepthProblemSolver = new ParenthesisDepthOptimalSolverImpl();
        depth = parenthesisDepthProblemSolver.maxDepth(parenthesisInput);
        System.out.println("Max Depth of Parenthesis optimal: " + depth);

        RomanNumeralsProblemSolverInterface roman = new RomanNumeralsSolverImpl();
        String romanInput = "MCMXCIV";
        int romanResult = roman.solve(romanInput);
        System.out.println("Roman " + romanInput +" Numerals to Integer: " + romanResult);

        RemoveOuterParenthesisProblemSolverInterface removeOuterParenthesis = new RemoveOuterParenthesisSolverImpl();
        String removedOuterParentheses = removeOuterParenthesis.removeOuterParentheses("()(()()())");
        System.out.println("Removed Outer Parentheses: " + removedOuterParentheses);

        LongestPalindromicSubStringProblemSolverInterface bruteForceLongestPalindromicSolver = new LongestPalindromicSubStringBruteForceSolverImpl();
        String longestPalindromicInput = "babad";
        String longestPalindromicResult = bruteForceLongestPalindromicSolver.longestPalindrome(longestPalindromicInput);
        System.out.println("Longest Palindromic Substring (Brute Force): " + longestPalindromicResult);
    }

    private static void findLongestConsecutiveSequence(FindLongestConsecutiveSequenceInterface findLongestConsecutiveSequenceInterface) {
        int[] inputArray = {100, 4, 200, 1, 3, 2};
        int result = findLongestConsecutiveSequenceInterface.longestConsecutive(inputArray);
        System.out.println(result);
    }
}
