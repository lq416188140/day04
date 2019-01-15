package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 13:582019/1/15 0015
 * @Modified by:
 *   冒泡排序
 **/
public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 8, 3, 7};
        //从小到大排序
        for (int i = 0; i < arr.length - 1; i++) {//循环计数
            for (int j = 0; j < arr.length - 1 - i; j++) {//冒泡法，俩俩比较，把最大的数移到最后；
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int a=0;a<arr.length;a++) {
            System.out.print(arr[a]);
        }
    }
}
