package com.simon.homework;

/**
 * ## 题目4（综合）
 * <p>
 * ?    我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。 ?    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * <p>
 * ### 训练提示
 * <p>
 * 1. 鸡翁的个数在一个范围内，那么要对一个范围内的数字依次判断，需要使用循环语句。 2. 鸡母的个数也在一个范围内，那么需要使用循环的嵌套。 3. 鸡的个数和价钱有等式关系的，如何列出等式？
 * <p>
 * ### 解题方案
 * <p>
 * ### 操作步骤
 * <p>
 * ?    1:第1层循环，用于表示鸡翁的范围，初始化表达式的变量定义为 x=0，判断条件是x<=20。 ?    2:第2层循环，用于表示鸡母的范围，初始化表达式的变量定义为 y=0，判断条件是y<=33。 ?    3:这个时候，用于表示鸡雏的变量 z = 100 – x – y。 ?    4:判断表达式 z%3==0 和表达式 5*x + 3*y + z/3 = 100 是否同时成立，如果成立，输出对应的 x，y，z 的值， ?      就是对应的鸡翁，鸡母，鸡雏的值。
 */
public class Test15_4 {
    public static void main(String[] args) {
        //设 鸡翁有x只
//        int x;
        //设 鸡母有y只
//        int y;
        //设 鸡雏有z只

        int z;

        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                z = 100 - x - y;
                if ((z % 3 == 0) && (5 * x + y * 3 + z / 3 == 100)) {
                    System.out.println("鸡翁 " + x + "只\t鸡母 " + y + "只\t鸡雏 " + z + "只");
                }
            }
        }

    }
}
