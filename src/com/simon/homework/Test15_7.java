package com.simon.homework;

import java.util.Scanner;

/**
 * ## 题目7（综合）
 *
 * 已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 *
 * ### 训练提示
 *
 * 1. 方法需要对一个数组做操作，所以方法的参数类型是整数数组类型。 2. 方法的功能是查找索引，所以方法的返回值类型是int类型。
 *
 * ### 解题方案
 *
 * ### 操作步骤
 *
 * ?    1:定义一个数组，用静态初始化完成数组元素的初始化。 ?    2:键盘录入要查找的数据，用一个变量接收。 ?    3:定义一个索引变量，初始值为-1。 ?    4:遍历数组，获取到数组中的每一个元素。 ?    5:拿键盘录入的数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋值给索引变量,并结束循环。 ?    6:输出索引变量。
 */
public class Test15_7 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        int value = scanner.nextInt();
        int index = getIndex(arr, value);
        if (index == -1) {
            System.out.println("当前数组没有您输入的值哦");

        } else {
            System.out.println("当前的索引是：" + index);

        }
    }

    private static int getIndex(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}
