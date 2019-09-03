package com.simon.javase.api_1;

import java.util.Scanner;

/**
 * 就业课(2.1)-常用API第一部分
 * 第2节 String 类  遍历字符串
 */
public class StringTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String content = scanner.nextLine();
        for (int i = 0; i < content.length(); i++) {
            System.out.println("第" + i + "个字符是 " + content.charAt(i));
        }
    }
}
