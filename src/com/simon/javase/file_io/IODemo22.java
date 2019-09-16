package com.simon.javase.file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties类 猜数字小游戏
 */
public class IODemo22 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("game.txt");
        prop.load(fr);
        int count = Integer.parseInt(prop.getProperty("count"));
        if (count >= 3) {
            System.out.println("还想玩啊，请交钱！");
        } else {
            System.out.println("玩了一次游戏，真爽！");
            count++;
            FileWriter fw = new FileWriter("game.txt");
            prop.setProperty("count", String.valueOf(count));
            prop.store(fw, null);
            fw.close();
        }
        fr.close();
    }

}
