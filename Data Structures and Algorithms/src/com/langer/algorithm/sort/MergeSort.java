package com.langer.algorithm.sort;

public class MergeSort {
    public void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1,right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int [] arr, int left, int mid, int right){
        int [] help = new int [right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right){
            help[i++] = arr[p1] < arr[p2]? arr[p1++]:arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= right){
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
    }
}
