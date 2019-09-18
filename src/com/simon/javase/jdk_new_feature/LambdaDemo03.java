package com.simon.javase.jdk_new_feature;

public class LambdaDemo03 {
    public static void main(String[] args) {
        //匿名内部类 带参数 有返回值
        useAddAble((int a, int b) -> {
            return a + b;
        });
    }

    public static void useAddAble(Addable eatable) {
        System.out.println(eatable.add(1, 2));
    }
}
