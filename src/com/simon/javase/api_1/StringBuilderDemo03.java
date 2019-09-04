package com.simon.javase.api_1;

import java.util.Scanner;

/**
 * 132_字符串反转升级版
 */
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.nextLine();
        String result = myReverse(input);
        System.out.println("result is " + result);
    }

    private static String myReverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
