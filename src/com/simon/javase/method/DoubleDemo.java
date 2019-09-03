package com.simon.javase.method;

import java.util.Scanner;

/**
 * 第13节 方法练习
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个小数");
        Double firstNum = scanner.nextDouble();
        int result = getResult(firstNum);
        System.out.println("四舍五入后为 " + result);
    }

    /**
     * 四舍五入
     *
     * @param firstNum
     * @return
     */
    private static int getResult(Double firstNum) {
        int _10number = (int) (firstNum * 10);
        int b = _10number % 10;
        int c = _10number / 10;
        if (b >= 5) {
            c++;
        }
        return c;
    }
}
