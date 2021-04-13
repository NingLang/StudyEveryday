package com.langer.algorithm.sort;

import com.langer.utils.ArrayUtils;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        ArrayUtils arrayUtils = new ArrayUtils();
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            arrayUtils.swap(arr, i, minIndex);
        }
    }

}
