package com.simon.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 第5节 学生管理系统
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。在判断验证码时一般不区分大小写。请编写程序模拟验证码的判断过程，如果输入正确，给出提示，结束程序。如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
 * <p>
 * 生成4位随机验证码的功能在之前的题目中已经完成，可以直接使用。《定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。》
 * <p>
 * 运行效果如下：
 * <p>
 * 生成的验证码为：BkhD 请输入验证码 abcd 输入错误，请重新输入... 生成的验证码为：n1wX 请输入验证码 aaaa 输入错误，请重新输入... 生成的验证码为：Fm1a 请输入验证码 fm1a 输入正确
 * <p>
 * ### 训练目标
 * <p>
 * 字符串的判断功能
 * <p>
 * ### 训练提示
 * <p>
 * 1、先定义获取验证码的方法，完成获取验证码的功能。
 * <p>
 * 2、根据题目要求，判断需要一直到输入正确为止，所以需要使用循环。
 * <p>
 * 3、用户输入由键盘录入，需要创建键盘录入对象。
 * <p>
 * 4、判断是否正确需要将用户输入的字符串与生成的验证码比较，但不区分大小写，所以该使用哪个方法呢？
 * <p>
 * 5、判断相等，给出提示，结束循环。判断不相等，给出提示，进入下一次循环。
 * <p>
 * ### 参考方案
 * <p>
 * <p>
 * <p>
 * ### 训练步骤
 * <p>
 * 1、定义方法，实现获取包含4个字符的随机验证码。（参考以前的练习）
 * <p>
 * 2、创建键盘录入Scanner对象。
 * <p>
 * 3、定义while循环，循环条件为true。
 * <p>
 * 4、在循环内，获取程序生成的验证码，提示用户输入，调用Scanner对象的nextLine方法获取用户输入。
 * <p>
 * 5、使用String的equalsIgnoreCase方法比较生成的验证码和用户输入，因为不区分大小写。
 * <p>
 * ?    5.1、如果相等，给出输入正确的提示，使用break语句跳出循环。
 * <p>
 * ?    5.2、如果不相等，给出输入错误的提示，继续下一次循环。
 */
public class Test148_3 {
    public static void main(String[] args) {
        while (true) {
            String code = getRandomCode();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入验证码：");
            String input = scanner.nextLine();
            if (input.equals(code)) {
                System.out.println("验证码正确，登录成功！");
                break;
            } else {
                System.out.println("请重新输入验证码！");
            }
        }

    }

    private static String getRandomCode() {
        StringBuilder sb = new StringBuilder();
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (char a = 'a'; a <= 'z'; a++) {
            sb.append(a);
        }
        for (char b = 'A'; b <= 'Z'; b++) {
            sb.append(b);
        }
        for (int c = 0; c <= 9; c++) {
            sb.append(c);
        }
        String content = sb.toString();
        for (int i = 0; i < 4; i++) {
            code.append(content.charAt(random.nextInt(content.length())));

        }
        System.out.println("生成的短信验证码是：" + code);
        return code.toString();
    }
}
