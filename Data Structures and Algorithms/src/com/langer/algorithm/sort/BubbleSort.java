package com.langer.algorithm.sort;

import com.langer.utils.ArrayUtils;

public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    public void bubbleSort(int[] arr) {
        ArrayUtils arrayUtils = new ArrayUtils();

        if (arr == null || arr.length < 2) {
            return;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    arrayUtils.swap(arr, i, i + 1);
                }
            }
        }
    }

}
