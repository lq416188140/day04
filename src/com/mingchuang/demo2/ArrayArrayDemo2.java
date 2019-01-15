package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 14:522019/1/15 0015
 * @Modified by:
 * int[][] arr=new int[3][];
 * 数组中定义了三个一维数组，每个一维数组的长度
 **/
public class ArrayArrayDemo2 {

    public static void main(String[] args) {
        int[][] arr=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        int[][] arr2= new int[][]{{3,1,2},{4,5,8},{9,5,9}};
        int[][] arr3={{1,2,5,6},{3,5,9},{5,8,9}};
        System.out.println(arr2);
        System.out.println(arr3);
    }
}
