package com.simon.homework;

import java.util.Random;

/**
 * 第5节 学生管理系统
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
 * <p>
 * 7Kt5
 */
public class Test148_2 {
    public static void main(String[] args) {

        String code = getRandomCode();

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
        System.out.println("生成的短信验证码是："+code);
        return code.toString();
    }
}
