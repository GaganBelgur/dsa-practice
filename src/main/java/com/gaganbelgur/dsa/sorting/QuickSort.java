package main.java.com.gaganbelgur.dsa.sorting;

public class QuickSort implements SortInterface {
    @Override
    public void sort(int[] inputArray) {
        if (inputArray == null || inputArray.length < 1) {
            return;
        }
        quickSortHelper(inputArray, 0, inputArray.length - 1);
    }

    private void quickSortHelper(int[] inputArray, int low, int high) {
        if(low < high) {
            int pivot = findPivot(inputArray, low, high);
            quickSortHelper(inputArray, low, pivot - 1);
            quickSortHelper(inputArray, pivot+1, high);
        }
    }

    private int findPivot(int[] inputArray, int low, int high) {
        int pivot = inputArray[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(inputArray[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (inputArray[j] > pivot && j >= low + 1) {
                j--;
            }

            if(i < j) {
                swap(inputArray, i,j);
            }
        }
        swap(inputArray, low, j);
        return j;
    }

    private void swap(int[] inputArray, int i, int j) {
      int temp = inputArray[i];
      inputArray[i] = inputArray[j];
      inputArray[j] = temp;
    }
}
