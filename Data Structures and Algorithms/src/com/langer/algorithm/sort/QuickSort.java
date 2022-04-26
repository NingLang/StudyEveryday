package com.langer.algorithm.sort;

import com.langer.utils.ArrayUtils;

public class QuickSort {

    /**
     * 经典快排
     * @param arr 待排序数组
     * @param L 数组左边界
     * @param R 数组右边界
     */
    public void quickSort(int [] arr, int L, int R){
        if(L < R){
            int mid = partition(arr, L, R);
            quickSort(arr, L, mid - 1);
            quickSort(arr,mid + 1, R);
        }
    }
    public static int partition(int []arr, int L, int R){
        ArrayUtils arrayUtils = new ArrayUtils();
        int more = R;
        int curr = L;
        while(curr < more){
            if(arr[curr] <= arr[R]){
                curr++;
            }else {
                arrayUtils.swap(arr, curr, --more);
            }
        }
        arrayUtils.swap(arr, curr, R);
        return curr;
    }

    /**
     * 快排基于荷兰国旗问题优化
     * @param arr 待排序数组
     * @param L 数组左边界
     * @param R 数组右边界
     */
    public void quickSortOpt(int [] arr, int L, int R){
        if(L < R){
            int [] p = partitionOpt(arr, L, R);
            quickSortOpt(arr, L, p[0]);
            quickSortOpt(arr,p[1], R);
        }

    }
    public static int[] partitionOpt(int []arr, int L, int R){
        ArrayUtils arrayUtils = new ArrayUtils();
        int less = L - 1;
        int more = R;
        int curr = L;
        while(curr < more){
            if(arr[curr] < arr[R]){
                arrayUtils.swap(arr, curr++, ++less);
            }else if(arr[curr] > arr[R]) {
                arrayUtils.swap(arr, curr, --more);
            }else {
                curr++;
            }
        }
        arrayUtils.swap(arr, curr, R);
        return new int[]{less, more + 1};
    }
}
