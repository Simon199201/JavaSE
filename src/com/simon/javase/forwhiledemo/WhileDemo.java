package com.simon.javase.forwhiledemo;

/**
 * 第7节 循环结构-for-while-do..while
 */
public class WhileDemo {
    public static void main(String[] args) {
        double paper = 0.1D;
        long number = 0;
        while (true) {
            number++;
            if ((paper *= 2) > 8844430) {
                System.out.println("需要折叠 "+number+" 次才能超过珠峰！！");
                break;
            } else {
                System.out.println("已经折叠了"+number+"次...");
            }
        }
    }
}
