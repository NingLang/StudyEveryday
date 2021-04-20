package com.langer.algorithm.sort;

import com.langer.utils.ArrayUtils;

public class QuickSort {


    public void quickSort(int [] arr, int L, int R){
        if(L < R){
            int mid = partition(arr, L, R);
            quickSort(arr, L, mid - 1);
            quickSort(arr,mid + 1, R);
        }
    }

    public void quickSortOpt(int [] arr, int L, int R){
        if(L < R){
            int [] p = partitionOpt(arr, L, R);
            quickSortOpt(arr, L, p[0]);
            quickSortOpt(arr,p[1], R);
        }

    }
    public static int partition(int []arr, int L, int R){
        ArrayUtils arrayUtils = new ArrayUtils();
        int num = arr[R];
        int more = R;
        int curr = L;
        while(curr < more){
            if(arr[curr] <= num){
                curr++;
            }else {
                arrayUtils.swap(arr, curr, --more);
            }
        }
        arrayUtils.swap(arr, curr, R);
        return curr;
    }

    public static int[] partitionOpt(int []arr, int L, int R){
        ArrayUtils arrayUtils = new ArrayUtils();
        int num = arr[R];
        int less = L - 1;
        int more = R + 1;
        int curr = L;
        while(curr < more){
            if(arr[curr] < num){
                arrayUtils.swap(arr, curr++, ++less);
            }else if(arr[curr] > num) {
                arrayUtils.swap(arr, curr, --more);
            }else {
                curr++;
            }
        }
        return new int[]{less, more};
    }
}
