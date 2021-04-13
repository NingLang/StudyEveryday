package com.langer.utils;

public class ArrayUtils {
    public ArrayUtils() {
    }

    /**
     * @param arr 数组
     * @param a a位置
     * @param b b位置
     */
    public void swap(int [] arr, int a, int b){
        int i = arr[a];
        arr[a] = arr[b];
        arr[b] = i;
    }


    /**
     * 生成一个长度为length,最大值为max的随机数组
     * @param length  数组长度
     * @param max 数组最大值
     * @return 随机数组
     */
    public int[] randomArray(int length, int max){
        int [] arr = new int[length];
        for (int i = 0; i < length; i++){
            arr[i]=(int)(Math.random()*max);
        }
        return arr;
    }
}
