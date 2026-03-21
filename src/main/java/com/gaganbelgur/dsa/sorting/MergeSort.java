package main.java.com.gaganbelgur.dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortInterface {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray == null || inputArray.length < 1) {
            return;
        }

        mergeSortHelper(inputArray, 0, inputArray.length - 1);
    }

    private void mergeSortHelper(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSortHelper(arr, low, mid);
        mergeSortHelper(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int i = low;
        int j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= high) {
            temp.add(arr[j]);
            j++;
        }

        for (int start = low; start <= high; start++) {
            arr[start] = temp.get(start - low);
        }
    }
}
