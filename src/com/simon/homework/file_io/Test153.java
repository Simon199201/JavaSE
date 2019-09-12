package com.simon.homework.file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 */
public class Test153 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
        System.out.println("请输入字符串：");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("886")) {
                break;
            }
            bw.write(input, 0, input.length());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
