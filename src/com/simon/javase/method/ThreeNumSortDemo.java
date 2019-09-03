package com.simon.javase.method;

import java.util.Scanner;

/**
 * 第13节 方法练习
 */
public class ThreeNumSortDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int firstNum = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int secondNum = scanner.nextInt();
        System.out.println("请输入第三个整数");
        int thirdNum = scanner.nextInt();
        print(firstNum, secondNum, thirdNum);

    }

    private static void print(int firstNum, int secondNum, int thirdNum) {
//        if (firstNum >= secondNum) {
//            if (thirdNum >= firstNum) {
//                System.out.print(thirdNum + "\t");
//                System.out.print(firstNum + "\t");
//                System.out.print(secondNum + "\t");
//            } else if (thirdNum <= secondNum) {
//                System.out.print(firstNum + "\t");
//                System.out.print(secondNum + "\t");
//                System.out.print(thirdNum + "\t");
//            } else {
//                System.out.print(firstNum + "\t");
//                System.out.print(thirdNum + "\t");
//                System.out.print(secondNum + "\t");
//            }
//        } else {
//            if (thirdNum >= secondNum) {
//                System.out.print(thirdNum + "\t");
//                System.out.print(secondNum + "\t");
//                System.out.print(firstNum + "\t");
//            } else if (thirdNum <= firstNum) {
//                System.out.print(secondNum + "\t");
//                System.out.print(firstNum + "\t");
//                System.out.print(thirdNum + "\t");
//            } else {
//                System.out.print(firstNum + "\t");
//                System.out.print(thirdNum + "\t");
//                System.out.print(secondNum + "\t");
//            }
//        }
        int max = getMax(firstNum, secondNum, thirdNum);
        int min = getMin(firstNum, secondNum, thirdNum);
        int mid = firstNum + secondNum + thirdNum - max - min;
        System.out.println(max + "\t" + mid + "\t" + min);
    }

    private static int getMin(int firstNum, int secondNum, int thirdNum) {
        int min;
        if (firstNum > secondNum) {
            min = secondNum;
            if (thirdNum < secondNum) {
                min = thirdNum;
            }
        } else {
            min = firstNum;
            if (thirdNum < firstNum) {
                min = thirdNum;
            }
        }
        return min;
    }

    private static int getMax(int firstNum, int secondNum, int thirdNum) {
        int max;
        if (firstNum > secondNum) {
            max = firstNum;
            if (thirdNum > firstNum) {
                max = thirdNum;
            }
        } else {
            max = secondNum;
            if (thirdNum > secondNum) {
                max = thirdNum;
            }
        }
        return max;
    }
}
