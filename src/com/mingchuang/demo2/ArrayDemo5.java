package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 11:492019/1/15 0015
 * @Modified by:
 * 计算数组中的最值，
 **/
public class ArrayDemo5 {
    public static void main(String[] args) {
        int [] arr={1,2,5,7,6,4,9};
        //定义变量，用来记录数组中的最值
        int max=arr[0];//先赋值数组中的第一个元素；
        int mix=arr[0];
        //变量数组，获取所有的元素，和变量max做比较，
        for (int i=0;i<arr.length;i++){
            //变量和数组中的每一个元素进行比较，
            //如果max，小于数组的一个元素，就把这个元素赋值给max。
            if (max<arr[i]){
                max=arr[i];
            }
            //遍历完成，变量max，就是数组最大值，

        }
        System.out.println(max);


    }
}
