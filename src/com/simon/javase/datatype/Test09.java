package com.simon.javase.datatype;

public class Test09 {
    public static void main(String[] args) {
        int[] aar = {19, 28, 37, 46, 50};
        revert(aar);
        printArr(aar);
    }

    /**
     * 打印数组
     * @param aar
     */
    private static void printArr(int[] aar) {
        System.out.print("[");
        for (int i = 0; i < aar.length; i++) {
            System.out.print(aar[i]+" ");
        }
        System.out.print("]");

    }

    /**
     * 反转数组
     * @param aar
     */
    private static void revert(int[] aar) {
        for (int start = 0, end = aar.length-1; start <= end; start++, end--) {
            int temp = aar[start];
            aar[start] = aar[end];
            aar[end] = temp;
        }
    }
}
