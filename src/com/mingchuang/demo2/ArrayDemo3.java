package com.mingchuang.demo2;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 11:352019/1/15 0015
 * @Modified by:
 * 数组的遍历：
 *  将所有的数组元素，全部获取，
 *  依靠索引，规律：从0开始，一直在自动增长1，到达length-1结束，
 *  循环来实现；
 *  for  已知循环次数，计数器的思想，
 *  while 不确定的循环次数。无法使用。
 **/
public class ArrayDemo3 {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
//打印杨辉三角

