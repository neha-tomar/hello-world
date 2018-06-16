package com.algorithms;

/**
 * Created by netomar on 6/17/2018.
 */
public class QuickSort {
    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pos = partition(arr, start, end);
            quickSort(arr, start, pos - 1);
            quickSort(arr, pos + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int i = start -1;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[end] = arr[i+1];
        arr[i+1] = pivot;
        return i + 1;
    }
}
