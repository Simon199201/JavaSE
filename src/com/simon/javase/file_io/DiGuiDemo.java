package com.simon.javase.file_io;

public class DiGuiDemo {
    public static void main(String[] args) {
        //不死神兔
        //f(n)
        //f(n-1)+f(n-2)
        System.out.println(f(19));
    }

    private static int f(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
    }
}
