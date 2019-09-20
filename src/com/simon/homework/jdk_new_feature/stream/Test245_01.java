package com.simon.homework.jdk_new_feature.stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 请在测试类main方法中完成以下需求 已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
 * a)    使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0) b)    使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100 c)    使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数          遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
 * i.    打印自然数的个数
 * ii.    打印负整数的个数
 * iii.    打印绝对值大于100的偶数的个数
 * iv.    打印是负整数或偶数的数的个数
 */
public class Test245_01 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
        Predicate<Integer> p1 = i -> i >= 0;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println(Stream.of(arr).filter(p1).count());
        System.out.println(Stream.of(arr).filter(p2.negate()).count());

        System.out.println(Stream.of(arr).filter(p2).filter(integer -> Math.abs(integer) > 100).count());

        System.out.println(Stream.concat(Stream.of(arr).filter(p1.negate()), Stream.of(arr).filter(p2)).distinct().count());
    }
}

