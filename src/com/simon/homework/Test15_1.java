package com.simon.homework;

import java.util.Scanner;

/**
 * 第15节 基础语法练习-课后习题
 * ## 题目1(综合)
 *
 * 通过键盘录入的方式输入星期数(1-7的整数)，显示今天的减肥活动，使用switch和if两种判断语句分别完成。 ?            周一：跑步 ?            周二：游泳 ?            周三：慢走 ?            周四：动感单车 ?            周五：拳击 ?            周六：爬山 ?            周日：好好吃一顿
 *
 * ### 训练提示
 *
 * 1. 有多种显示结果，每种结果不会同时出现，所以用的是多条件的判断语句。
 *
 * ### 解题方案
 *
 * ### 操作步骤
 *
 * ?    1:键盘录入一个1-7的星期数，用一个变量week接收。 ?    2:对week进行判断，用if和switch两种方式分别完成。 ?    3:在对应的语句控制中输出对应的减肥活动。
 */
public class Test15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入今天是星期几 ");
        int nextInt = scanner.nextInt();
//        testIf(nextInt);
        testSwitch(nextInt);
    }

    private static void testSwitch(int nextInt) {
        switch (nextInt) {
            case 1:
                System.out.println("周一： 跑步" );

                break;
            case 2:
                System.out.println("周二： 游泳" );

                break;
            case 3:
                System.out.println("周三： 慢走" );

                break;
            case 4:
                System.out.println("周四： 动感单车" );

                break;
            case 5:
                System.out.println("周五： 拳击" );

                break;
            case 6:
                System.out.println("周六： 爬山" );

                break;
            case 7:
                System.out.println("周日： 好好吃一顿" );

                break;
            default:
                System.out.println("请输入正确的星期");

                break;

        }
    }

    private static void testIf(int nextInt) {
        if (nextInt < 1 || nextInt > 7) {
            System.out.println("请输入正确的星期");
        }else if (nextInt == 1) {
            System.out.println("周一： 跑步" );
        } else if (nextInt == 2) {
            System.out.println("周二： 游泳" );

        } else if (nextInt == 3) {
            System.out.println("周三： 慢走" );

        } else if (nextInt == 4) {
            System.out.println("周四： 动感单车" );

        } else if (nextInt == 5) {
            System.out.println("周五： 拳击" );

        } else if (nextInt == 6) {
            System.out.println("周六： 爬山" );

        } else {
            System.out.println("周日： 好好吃一顿" );

        }
    }

}
