package com.simon.homework;

import java.util.Scanner;

/**
 * 第5节 学生管理系统
 * 在String类的API中，有如下两个方法：
 * <p>
 * // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1 public int indexOf(String str)
 * <p>
 * // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾 public String substring(int beginIndex)
 * <p>
 * 请仔细阅读API中这两个方法的解释，完成如下需求。
 * <p>
 * 现有如下文本："Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。请编写程序，统计该文本中"Java"一词出现的次数。
 * <p>
 * ### 训练目标
 * <p>
 * String类API的灵活使用
 * <p>
 * ### 训练提示
 * <p>
 * 1、要找的子串是否存在，如果存在获取其出现的位置。这个可以使用indexOf完成。 2、如果找到了，那么就记录出现的位置并在剩余的字符串中继续查找该子串，而剩余字符串的起始位是出现位置再加上子串的长度。
 * <p>
 * 3、以此类推，通过循环完成查找，如果找不到就是-1，每次找到用计数器记录次数。
 * <p>
 * ### 参考方案
 * <p>
 * 从左至右依次查找，将已查找的部分截取掉。
 * <p>
 * ### 训练步骤
 * <p>
 * 1、定义方法，返回值int表示次数，参数列表两个字符串，第一个表示在哪个字符串中查找，第二个表示要查找的目标子串
 * <p>
 * 2、定义统计变量表示次数。
 * <p>
 * 3、定义索引变量，表示每次找到子串出现的索引。
 * <p>
 * 4、定义循环，判断条件为在字符串中找到了目标子串，使用indexOf实现。
 * <p>
 * 5、如果找到的索引不是-1，在循环中，统计变量累加。
 * <p>
 * 6、把查找过的部分剪切掉，从找到的索引+子串长度的位置开始截取，使用substring实现。
 * <p>
 * 7、将次数返回
 * <p>
 * 8、在主方法中，定义字符串表示题目中的文本，定义字符串表示要查找的子串，调用方法，获取结果。
 */
public class Test148_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要校验的内容：");
        String input = scanner.nextLine();
        int count = getPickCount(input);
        System.out.println("总共包含" + count + "个java");
    }

    private static int getPickCount(String input) {
        int count = 0;
        String content = input;
        while (true) {
            if (content.contains("java")) {
                count++;
                int index = content.indexOf("java");
                System.out.println("当前位置在第" + index + "位");
                content = content.substring(index + "java".length());
            } else {
                break;
            }
        }
        return count;
    }

}

