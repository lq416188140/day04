package com.mingchuang.demo;

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
        function_1();
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
