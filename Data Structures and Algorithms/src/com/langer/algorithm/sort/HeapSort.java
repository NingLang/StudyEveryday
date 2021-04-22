package com.langer.algorithm.sort;

import com.langer.utils.ArrayUtils;

public class HeapSort {
    public void heapSort(int [] arr){
        ArrayUtils arrayUtils = new ArrayUtils();
        if(arr == null || arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        arrayUtils.swap(arr,0,--heapSize);
        while (heapSize>0){
            heapify(arr, 0 , heapSize);
            arrayUtils.swap(arr,0,--heapSize);
        }
    }

    public static void heapInsert(int [] arr, int index){
        ArrayUtils arrayUtils = new ArrayUtils();
        while (arr[(index-1)/2] <arr[index]){
            arrayUtils.swap(arr, index,(index-1)/2);
            index = (index-1)/2;
        }
    }

    public static void heapify(int [] arr, int index, int heapSize){
        ArrayUtils arrayUtils = new ArrayUtils();
        int left = index*2 + 1;
        while (left < heapSize){
            int largeIndex = left + 1 < heapSize && arr[left] < arr[left + 1] ? left + 1 : left;
            largeIndex = arr[largeIndex] < arr[index] ? index : largeIndex;
            if(largeIndex == index){
                break;
            }
            arrayUtils.swap(arr, index, largeIndex);
            index = largeIndex;
            left = index*2 + 1;
        }
    }
}
