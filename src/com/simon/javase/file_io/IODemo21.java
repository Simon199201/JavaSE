package com.simon.javase.file_io;

import java.io.*;
import java.util.Properties;

/**
 * Properties类 作为Map集合的
 */
public class IODemo21 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("key", "value");
        prop.setProperty("key", "value");
        prop.setProperty("key1", "value1");
        prop.stringPropertyNames();//所有ket的set集合
        FileWriter fileWriter = new FileWriter("fw.txt");
        prop.store(fileWriter, null);
        fileWriter.close();
    }

}
