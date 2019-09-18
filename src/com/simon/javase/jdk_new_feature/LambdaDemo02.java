package com.simon.javase.jdk_new_feature;

public class LambdaDemo02 {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable((String s) -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }

    public static void useFlyable(Flyable eatable){
        eatable.fly("风和日丽，晴空万里");
    }
}
