package com.simon.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 第5节 学生管理系统
 * ## 题目5（应用）
 *
 * 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
 *
 * ### 训练目标
 *
 * 字符串的反转功能，判断是否相等功能
 *
 * ### 训练提示
 *
 * 1、判断是否对称，方法的返回值是什么类型？参数列表是什么？
 *
 * 2、怎样判断对称呢？如果可以将字符串反转，反转后发现跟原来的字符串完全一样，不就可以判断出来了吗，那么哪个类有字符串的反转功能呢？
 *
 * ### 参考方案
 *
 *
 *
 * ### 训练步骤
 *
 * 1、定义方法，返回值类型为boolean，参数列表为String类型的一个参数。
 *
 * 2、将字符串转换为StringBuilder类型，调用StringBuilder的reverse()方法将字符串反转。
 *
 * 3、将反转后的字符串再转回String类型，并与原字符串比较，如果相等，返回true，否则返回false
 *
 * 4、在主方法中，定义一个字符串，调用方法测试结果。
 */
public class Test148_5 {
    public static void main(String[] args) {
        String a = "你好你";
        String b = "你好你啊";
        boolean isRight = compare(a);
        System.out.println(a+"\t"+(isRight?"对称！":"不对称！"));
        isRight = compare(b);
        System.out.println(b+"\t"+(isRight?"对称！":"不对称！"));
    }

    private static boolean compare(String a) {
        StringBuilder s1 = new StringBuilder(a);
        if (s1.reverse().toString().equals(a)) {
            return true;
        } else {
            return false;
        }
    }
}
