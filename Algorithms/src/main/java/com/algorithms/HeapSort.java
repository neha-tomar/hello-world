package com.algorithms;

/**
 * Created by netomar on 6/25/2018.
 */
public class HeapSort {
    private int getParent(int i) {
        return (i-1)/2;
    }
    private int getLeftChild(int i) {
        return 2*i + 1;
    }
    private int getRightChild(int i) {
        return 2*i + 2;
    }

    private void buildHeap(int[] a) {
        for (int i = a.length/2 - 1; i >=0; i--) {
            maxHeapify(a, i, a.length);
        }
    }

    private void maxHeapify(int[] arr, int i, int heapLength) {
        if (i >= (arr.length / 2)) {
            return;
        }
        int largest;
        if (getLeftChild(i) < heapLength && arr[i] < arr[getLeftChild(i)]) {
            largest = getLeftChild(i);
        } else {
            largest = i;
        }
        if (getRightChild(i) < heapLength && arr[largest] < arr[getRightChild(i)]) {
            largest = getRightChild(i);
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, heapLength);
        }
    }

    public int[] heapSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        buildHeap(arr);
        int heapLength = arr.length;
        while (heapLength > 0) {
            int temp = arr[0];
            arr[0] = arr[heapLength - 1];
            arr[heapLength - 1] = temp;
            maxHeapify(arr, 0, --heapLength);

        }
        return arr;
    }
}
