package com.simon.javase.api_2;

import java.util.Arrays;

/**
 * 工具类 设计思想：
 * 构造方法用private修饰
 * 成员用public static 修饰，强制用类名进行使用
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前：" + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后："+Arrays.toString(arr));

    }
}
