package com.simon.javase.jdk_new_feature;

public class LambdaDemo01 {
    public static void main(String[] args) {
        //Lambda表达式
        new Thread(() -> {
            System.out.println("一天一苹果，医生远离我");
        }).start();
        //前提：一个接口里，只有一个方法
        eatable(()->{
            System.out.println("一天一苹果，医生远离我");
        });
    }

    public static void eatable(Eatable eatable){
        eatable.eat();
    }
}
