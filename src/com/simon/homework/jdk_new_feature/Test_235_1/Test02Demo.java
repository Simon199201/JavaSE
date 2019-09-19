package com.simon.homework.jdk_new_feature.Test_235_1;

public class Test02Demo {
    public static void main(String[] args) {
        getProduct(3, 5, (a, b) -> a * b);
    }

    private static void getProduct(int a, int b, IntCalc calc) {
        int count = calc.calc(a, b);
        System.out.println(count);
    }
}
