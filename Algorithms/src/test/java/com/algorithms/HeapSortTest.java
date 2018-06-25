package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by netomar on 6/25/2018.
 */
public class HeapSortTest {
    @Test
    public void testHeapSort() {
        int[] arr = {3, 5, 1, 98, 23, 44, 100};
        int[] sortedArr = {1, 3, 5, 23, 44, 98, 100};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertTrue(Arrays.equals(sortedArr, arr));
    }
}
