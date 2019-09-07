package com.simon.javase.api_2.split;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strings = s.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            arr[i] = Integer.parseInt(string);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("--------");
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
