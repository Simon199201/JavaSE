package com.simon.javase.jdk_new_feature.function_interface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String s = "林青霞,30";
        int a = dealString(s, s1 -> {
            String[] arr = s1.split(",");
            return Integer.valueOf(arr[1]);
        }, integer -> (integer + 70));
        System.out.println(a);
    }

    private static int dealString(String s, Function<String, Integer> function, Function<Integer, Integer> function2) {
        return function.andThen(function2).apply(s);
    }
}
