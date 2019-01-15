package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 14:402019/1/15 0015
 * @Modified by:
 * 二维数组：数组里面存储的还是数组；
 * 定义方式：
 * 数组类型 [][] arrs=new int[][]
 **/
public class ArraryArrayDemo {
    public static void main(String[] args) {
        int [][] arrs=new int[3][4];
        System.out.println(arrs);
        System.out.println(arrs[0]);
        System.out.println(arrs[1][2]);
    }

}
