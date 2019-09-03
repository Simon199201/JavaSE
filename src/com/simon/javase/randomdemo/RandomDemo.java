package com.simon.javase.randomdemo;

import java.util.Random;
import java.util.Scanner;

/**
 * 第8节 猜数字小游戏
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);//0-9
        System.out.println("number is " + number);
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10);//0-9
            System.out.println("randomNumber is " + randomNumber);
        }

        int realNumber = random.nextInt(100)+1;//1-100
        System.out.println("真实的数字是" + realNumber);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int guessNumber = scanner.nextInt();
            if (guessNumber < realNumber) {
                System.out.println("猜小啦！");
            } else if (guessNumber > realNumber) {
                System.out.println("猜大啦！");
            } else {
                System.out.println("猜中啦！");
                break;
            }
        }
    }
}
