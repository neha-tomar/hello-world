package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by netomar on 6/17/2018.
 */
public class QuickSortTest {
    @Test
    public void quickSortTest() {
        int[] arr = {3, 5, 1, 98, 23, 44, 100};
        int[] sortedArr = {1, 3, 5, 23, 44, 98, 100};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length-1);

        Assert.assertTrue(Arrays.equals(sortedArr, arr));
     }

     @Test
    public void quickSortTestWithNegative() {
         int[] arr = {-3, 5, 1, 98, 23, 44, -100};
         int[] sortedArr = {-100, -3, 1, 5, 23, 44, 98};
         QuickSort quickSort = new QuickSort();
         quickSort.quickSort(arr, 0, arr.length-1);

         Assert.assertTrue(Arrays.equals(sortedArr, arr));
     }
}
