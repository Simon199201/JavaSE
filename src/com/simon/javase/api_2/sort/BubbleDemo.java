package com.simon.javase.api_2.sort;

public class BubbleDemo {
    public static void main(String[] args) {
        int[] arr = {70, 53, 44, 26, 10};
        System.out.println("排序前：");
        arrayToString(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后：");
        arrayToString(arr);
    }

    private static void arrayToString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]);
                System.out.print(",");
            }

        }
        System.out.println("]");

    }
}
