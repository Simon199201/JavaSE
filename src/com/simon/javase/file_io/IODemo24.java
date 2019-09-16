package com.simon.javase.file_io;

import com.simon.javase.api_1.Student;

import java.io.*;

/**
 * 标准流&打印流
 */
public class IODemo24 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //字节打印流
        PrintStream ps = new PrintStream("ps.txt");
        ps.print(97);
        ps.flush();
        ps.close();

        //字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"), true);
        pw.print(97);
        pw.close();
    }

}
