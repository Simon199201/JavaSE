package com.simon.javase.method;

import java.util.Random;

/**
 * 第13节 方法练习
 */
public class GuessDemo {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] leaveArr = new int[arr.length];
        int size = 0;
        while (true) {
            int index = getRandomIndex(arr.length);
            if (size == 0) {
                leaveArr[0] = arr[index];
                size++;
                System.out.println(leaveArr[0] + "元的奖金被抽出");
            } else {
                boolean isMatch = isContainCurrentNum(size, leaveArr, arr, index);
                if (!isMatch) {
                    leaveArr[size] = arr[index];
                    System.out.println(leaveArr[size] + "元的奖金被抽出");
                    size++;
                }
                if (size == arr.length) {
                    break;
                }
            }

        }
    }

    private static boolean isContainCurrentNum(int size, int[] leaveArr, int[] arr, int index) {
        boolean isMatch = false;
        for (int i = 0; i < size; i++) {
            if (leaveArr[i] == arr[index]) {
                isMatch = true;
                break;
            }
        }
        return isMatch;
    }

    private static int getRandomIndex(int length) {
        Random random = new Random();
        int index = random.nextInt(length);
        return index;
    }
}
