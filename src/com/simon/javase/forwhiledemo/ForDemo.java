package com.simon.javase.forwhiledemo;

/**
 * 第7节 循环结构-for-while-do..while
 */
public class ForDemo {
    public static void main(String[] args) {
        //水仙花数
        for (int i = 100; i <= 999; i++) {
            int pre = i / 100;
            int mid = i / 10 % 10;
            int end = i % 10;
            if (pre * pre * pre + mid * mid * mid + end * end * end == i) {
                System.out.println("水仙花数包含 " + i);
            }
        }
    }
}