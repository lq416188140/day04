package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 11:432019/1/15 0015
 * @Modified by:
 * 数组操作者，常见的俩个异常
 * 1、数组的索引越界异常      Java.lang.ArrayIndexOutOfBoundsException
 * 2、空指针异常              Java.lang.NullPointerException
 **/
public class ArrayDemo4 {
    public static void main(String[] args) {
        //空指针异常
        int [] arr={1,5,8};
        System.out.println(arr);
        System.out.println(arr[2]);
        //arr=null;
        System.out.println(arr);
        System.out.println(arr[2]);

    }
}
