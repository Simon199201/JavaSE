package com.simon.homework;

import java.util.Scanner;

/**
 * ## 题目9（综合）
 * <p>
 * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 * <p>
 * ### 训练提示
 * <p>
 * 1. 要知道最终分，就要知道总分，最高分和最低分，每一个小的功能都可以定义一个方法单独完成。
 * <p>
 * ### 解题方案
 * <p>
 * ### 操作步骤
 * <p>
 * 1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6。 ?    2:键盘录入评委分数。 ?    3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进。 ?    4:定义方法实现获取数组中的最高分(数组最大值)，调用方法。 ?    5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法。 ?    6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法。 ?    7:按照计算规则进行计算得到平均分。 ?    8:输出平均分。
 */
public class Test15_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i+1) + "个裁判分数：");
            prices[i] = scanner.nextInt();
        }
        int max = getMax(prices);
        int min = getMin(prices);
        int total = getTotal(prices);
        int average = (total - min - max) / (prices.length - 2);
        System.out.println("平均分是 " + average);
    }

    private static int getTotal(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    private static int getMin(int[] prices) {
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return min;
    }

    private static int getMax(int[] prices) {
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        return max;
    }
}
