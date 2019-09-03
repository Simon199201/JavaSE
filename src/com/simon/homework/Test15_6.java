package com.simon.homework;

/**
 * ## 题目6（综合）
 * <p>
 * 设计一个方法，用于比较两个数组的内容是否相同。
 * <p>
 * ### 训练提示
 * <p>
 * 1. 数组内容相同，指的是元素个数相同，元素值相同，并且元素顺序相同，条件缺一不可。
 * <p>
 * ### 解题方案
 * <p>
 * ### 操作步骤
 * <p>
 * ?    1:定义两个数组，分别使用静态初始化完成数组元素的初始化。 ?        2:定义一个方法，用于比较两个数组的内容是否相同。 ?        3:比较两个数组的内容是否相同，按照下面的步骤实现就可以了。 ?            3.1.首先比较数组长度，如果长度不相同，数组内容肯定不相同，返回false。 ?            3.2.其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false。 ?            3.3.最后循环遍历结束后，返回true。 ?        4:调用方法，用变量接收。 ?        5:输出结果。
 */
public class Test15_6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 10};
        int[] arr2 = {1, 3, 5, 10};
        boolean isSame = compare(arr1, arr2);
        System.out.println("是否相同：" + isSame);
    }

    private static boolean compare(int[] arr1, int[] arr2) {
        boolean isSame = false;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isSame = false;
                    break;
                }
            }
            isSame = true;
        }
        return isSame;
    }
}
