package com.simon.javase.jdk_new_feature.function_interface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        dealString("hello", System.out::println);
        dealString("hello", System.out::println, s -> {
            System.out.println(s+"\t"+"world");
        });
    }

    private static void dealString(String content, Consumer<String> consumer) {
        consumer.accept(content);
    }

    private static void dealString(String content, Consumer<String> consumer, Consumer<String> consumer1) {
        consumer.andThen(consumer1).accept(content);
    }
}
