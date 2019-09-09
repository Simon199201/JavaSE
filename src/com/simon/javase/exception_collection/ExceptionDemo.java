package com.simon.javase.exception_collection;

import java.util.Scanner;

/**
 * 就业课(2.1)-异常&集合
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ScoreException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入考生分数");

        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            throw new ScoreException("你给的分数有误，分数应该在0-100之间");
        } else {
            System.out.println("分数正常");
        }
//        System.out.println(1/0);//java.lang.ArithmeticException
        //NumberFormatException
//        System.out.println(Integer.parseInt("itcast"));
    }
    public static class ScoreException extends Exception{
        public ScoreException() {

        }

        public ScoreException(String message) {
            super(message);
        }
    }
}
