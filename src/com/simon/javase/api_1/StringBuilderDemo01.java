package com.simon.javase.api_1;

/**
 * 第3节 StringBuilder类
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = stringBuilder.append("你好");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder == stringBuilder2);

        //链式变成
        stringBuilder.append("hello").append("world").append("110");
        System.out.println(stringBuilder.toString());


        //相互转换
        String s = stringBuilder.toString();
        StringBuilder s3 = new StringBuilder("你好");
        System.out.println("s :" + s);
        System.out.println("stringbuilder is " +s3);
    }
}
