package com.simon.javase.file_io;

public class DiGuiDemo01 {
    public static void main(String[] args) {
        //求5的阶乘
        //5!=5*4*3*2*1
        System.out.println(f(5));
        System.out.println(5 * 4 * 3 * 2);
    }

    private static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) * n;
    }
}
