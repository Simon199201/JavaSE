package com.simon.homework.file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 【代码题】
 * 描述: 我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100" score.txt文件内容如下：
 * zhangsan = 90 lisi = 80 wangwu = 85
 */
public class Test174 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fileReader = new FileReader("score.txt");
        prop.load(fileReader);
        System.out.println(prop);
        if (prop.getProperty("lisi") != null) {
            prop.setProperty("lisi", String.valueOf(100));
            FileWriter fileWriter = new FileWriter("score.txt");
            prop.store(fileWriter, null);
            fileWriter.close();
        }
        fileReader.close();
    }
}
