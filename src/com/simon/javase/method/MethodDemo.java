package com.simon.javase.method;

import java.util.Scanner;

/**
 * 第13节 方法练习
 */
public class MethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入行数");
        int row = scanner.nextInt();
        System.out.println("请输入列数");
        int column = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
