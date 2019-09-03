package com.simon.javase.api_1;

import java.util.Scanner;

/**
 * 就业课(2.1)-常用API第一部分
 * 第2节 String 类  用户登录
 */
public class StringTest01 {
    public static void main(String[] args) {
        String username = "小明";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        boolean isSuccess = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = scanner.nextLine();
            System.out.println("请输入密码：");

            String pwd = scanner.nextLine();
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println("登录成功！");
                isSuccess = true;
                break;
            }
            if (i != 2) {
                System.out.println("你还有" + (2 - i) + "次机会");
            }
        }
        if (!isSuccess) {
            System.out.println("输入次数已超过三次!!");
        } else {
            System.out.println();
        }
    }
}
