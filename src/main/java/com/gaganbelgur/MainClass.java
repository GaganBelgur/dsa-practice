package main.java.com.gaganbelgur;

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
    }
}
