package com.simon.homework.jdk_new_feature.Test_235_2;

public class Test03 {
    public static void main(String[] args) {
        decToHex(222, Integer::toHexString);
    }

    static void decToHex(int num, NumberToString nts) {
        System.out.println(nts.convert(num));
    }
}
