package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 10:542019/1/15 0015
 * @Modified by:
 **/

public class ArrayDemo {
    public static void main(String[] args) {
        //定义数组。存储整数。容器长度 3个。
        int[] arr = new int[3];
        System.out.print(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
/*
*java.lang.ArrayIndexOutOfBoundsException
*数组下标越界异常
**/
