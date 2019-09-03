package com.simon.javase.datatype;

public class Test03 {
    public static void main(String[] args) {
        byte a = -128;
        short b = 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 - 1;
        int c = 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 - 1;
        long d = 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2L;

        double e = 1.13D;
        float f = 1.13F;

        char g = 'A';
        boolean h = true;
        System.out.println("byte is " + a);
        System.out.println("short is " + b);
        System.out.println("int  is " + c);
        System.out.println("long is " + d);
        System.out.println("double is " + e);
        System.out.println("float is " + f);
        System.out.println("char  is " + g);
        System.out.println("boolean  is " + h);

    }
}
