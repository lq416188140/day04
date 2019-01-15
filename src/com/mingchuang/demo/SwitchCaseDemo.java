package com.mingchuang.demo;

import java.util.Scanner;

/**
 * @Author：林桥
 * @Destription：
 * @Data：Crerted in 9:542019/1/15 0015
 * @Modified by:
 * switch语句结构
 * switch只能针对某个表达式的值进行判断，从而决定程序执行
 * 哪一段代码
 * 格式；
 * switch（表达式）{
 *     casa 常量1；
 *     要执行的语句；
 *     break；
 *
 *     casa 常量1；
 *     要执行的语句；
 *     break；
 *
 *     casa 常量1；
 *     要执行的语句；
 *     break；
 *     default:
 *     语句;
 *
 * }
 * 执行流程：
 * 表达式和
 **/
public class SwitchCaseDemo {
    public static void main(String[] args) {
      //看程序写结果
        /**
         * 键盘录入月份，输出相对应的季节
         * 3，4,5，是春季
         * 6,7,8，是夏季
         * 9,10,11，是秋季
         * 12,1,2 是冬季
         * 合理运用case击穿
         */
        Scanner month=new Scanner(System.in);
        System.out.println("请输入一个月份");
        int a=month.nextInt();
        if(a>12){
            System.out.println("====================");
            System.out.println("输入错误，请重新输入");
             a=month.nextInt();
        }
        switch(a){
            case 3:
            case 4:
            case 5:
                System.out.println("您输入的月份是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您输入的月份是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您输入的月份是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("您输入的月份是冬季");
                break;



        }

    }

    public static int functtion_2() {
        int x=2;
        int y=3;
        switch (x){
            default:
                y++;
            case 3:
                y++;
                break;
            case 4:
                y++;
        }
        return y;
    }

    public static void function_1() {
        int week =5;
        switch (week){
            /*
            *switch表达式的数据类型，是有要求的
            * JDK1.0-1.4数据类型接受：byte short int long
            * JDK1.5 多了一个枚举（enum）；
            * JDk1.7多了一个String
             */
            case 1://case后的值要唯一，且是定值，数据类型要与switch后的表达式结果数据类型一致。
                System.out.println("礼拜一");
                break;//如果没有break，会造成case击穿，会一直向下执行。
            case 2:
                System.out.println("礼拜二");
                break;
            case 3:
                System.out.println("礼拜三");
                break;
            case 4:
                System.out.println("礼拜四");
                break;
            case 5:
                System.out.println("礼拜五");
                break;
            case 6:
                System.out.println("礼拜六");
                break;
            case 7:
                System.out.println("礼拜天");
                break;
            default://不是必须的，可有可无，不写也不会报错，case都不满足时执行，default是最后执行的，
                System.out.println("日期无");
                break;//此处的break可写可不写。

        }
    }
}
