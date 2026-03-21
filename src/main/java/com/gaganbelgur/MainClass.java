package main.java.com.gaganbelgur;

import main.java.com.gaganbelgur.dsa.sorting.MergeSort;
import main.java.com.gaganbelgur.dsa.sorting.SortInterface;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        SortInterface mergeSort = new MergeSort();
        int[] inputArray = {4, 3, 9, 1};
        mergeSort.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
}
