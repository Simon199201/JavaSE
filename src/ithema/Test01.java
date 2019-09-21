package ithema;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 请编写程序，完成下列需求 需求：    1.在当前项目根目录下，创建一个number1.txt文件。并手动写入以下内容：
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("number1.txt", true));
        String[] arr = {"5", "6", "123", "123", "77", "34", "88", "69", "23", "34"};
        for (String anArr : arr) {
            bw.write(anArr);
            bw.newLine();
            bw.flush();
        }
        //关闭输出流
        bw.close();
    }
}
