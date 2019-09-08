package com.simon.javase.generic;

/**
 *
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));

        System.out.println("--------");

    }

    public static int sum(int... a) {
        System.out.println(a);
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    //可变参数要放到后边，变量其实是一个数组
    public static int sum1(int b, int... a) {
        System.out.println(a);
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
