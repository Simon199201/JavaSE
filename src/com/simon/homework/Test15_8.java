package com.simon.homework;

/**
 * ## 题目8（综合）
 * <p>
 * ?    已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值反转(在原数组中操作，不能定义第二个数组)，反转后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出反转后的数组元素。
 * <p>
 * ### 训练提示
 * <p>
 * 1. 数组的反转也就是把数组前后的元素一一交换。 2. 通过什么方式，能够交换数组中两个元素的位置？
 * <p>
 * ### 解题方案
 * <p>
 * ### 操作步骤
 * <p>
 * ?    1:定义一个数组，用静态初始化完成数组元素的初始化。 ?    2:循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引。 ?    3:使用第三个临时变量，完成数组中两个元素的交换。 ?    4:遍历数组。
 */
public class Test15_8 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        reverseArr(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for (; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
