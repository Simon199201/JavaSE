package com.simon.javase.api_1;

/**
 * 131_字符串拼接升级版
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = arrayToString(arr);
        System.out.println("result is : " + result);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);

            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
