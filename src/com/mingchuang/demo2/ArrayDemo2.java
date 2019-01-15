package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 11:222019/1/15 0015
 * @Modified by:
 * 数组的另外俩种定义方式：
 * 1、数据类型 [] 变量名=new 数据类型[]{元素1、元素2.....};
 *      注意事项；new后面的[]不允许写任何内容，写了就编译失败。
 * 2、数据类型 [] 变量名={元素1，元素2......}；
 **/
public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义数组的同时对元素进行赋值
        int [] arr=new int[]{1,2,3,4,5,};
        System.out.println(arr);
        arr=new int[]{1,2,3,4,5,6,};
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println();
        int [] arr2={1,2,3,4,5};
        System.out.println(arr2[0]);
        System.out.println(arr2[arr2.length-1]);
    }
}
