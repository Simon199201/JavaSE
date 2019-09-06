package com.simon.javase.interfacedemo;

public class Demo {
    public static void main(String[] args) {
        Inter inter = new InterImpl();
        System.out.println(inter.num+"\t"+inter.num2);
//        inter.num = 20;// 不可以，接口中的成员变量只能是常量，public static  final int num = 3;
    }
}
