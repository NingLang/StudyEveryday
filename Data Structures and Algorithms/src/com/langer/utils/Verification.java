package com.langer.utils;

import com.langer.algorithm.sort.BubbleSort;
import com.langer.algorithm.sort.InsertionSort;
import com.langer.algorithm.sort.MergeSort;
import com.langer.algorithm.sort.SelectionSort;

import java.util.Arrays;


public class Verification {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        ArrayUtils arrayUtils = new ArrayUtils();
        for (int i = 0; i < 100; i++) {
            int [] arr = arrayUtils.randomArray(10,100);
            int [] arrTmp1 = new int[10];
            int [] arrTmp2 = new int[10];
            for (int j = 0; j < arr.length; j++) {
                arrTmp1[j] = arr[j];
                arrTmp2[j] = arr[j];
            }
            insertionSort.insertionSort(arrTmp1);
            Arrays.sort(arrTmp2);
            for (int j = 0; j < arr.length; j++) {
                if(arrTmp1[j] != arrTmp2[j]) {
                    System.out.println("Fuck!!!!!");
                    System.out.println(Arrays.toString(arr));
                    return;
                }
            }
        }
        System.out.println("Perfect");
    }

}
