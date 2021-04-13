package com.langer.algorithm.sort;

import com.langer.utils.ArrayUtils;

public class InsertionSort {
    public void insertionSort(int [] arr){
        ArrayUtils arrayUtils = new ArrayUtils();
        if (arr == null || arr.length < 2){
            return;
        }
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    arrayUtils.swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }
}
