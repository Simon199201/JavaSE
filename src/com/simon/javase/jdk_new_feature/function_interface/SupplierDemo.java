package com.simon.javase.jdk_new_feature.function_interface;

import java.util.function.Supplier;

/**
 * Supplier
 */
public class SupplierDemo {
    public static void main(String[] args) {
        getString(() -> {
            return "hello,java";
        });
    }

    private static void getString(Supplier<String> supplier) {
        String s = supplier.get();
        System.out.println("string is " + s);
    }


}
