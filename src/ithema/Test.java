package ithema;

import java.io.*;
import java.util.*;

/**
 * 2.定义一个测试类：Test
 * <p>
 * 2.1创建一个File对象，关联number1.txt文件
 * 2.2通过File对象进行判断，如果当前对象是一个文件的话，则继续执行下面步骤
 * 2.3创建一个BufferedReader对象，关键已有的File对象
 * 2.4创建HashSet集合对象，泛型为String
 * 2.5通过输入流对象读取文件中内容，将每个数字都保存到集合中
 * 2.6创建一个List集合，将HashSet集合中的所有元素全部添加到List集合中
 * 2.7对List集合元素进行排序。按照从小到大的顺序
 * 2.8创建一个BufferedWriter对象，关联到当前项目下的number2.txt文件
 * 2.9通过输出流对象将List集合中的所有元素全部写出
 * 2.10number2.txt文件中最终内容如下：
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("number1.txt");
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            HashSet<String> hashSet = new HashSet<>();
            String s;
            while ((s = br.readLine()) != null) {
                hashSet.add(s);
            }
            br.close();

            List<String> list = new ArrayList<>();
            Iterator<String> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
            Collections.sort(list, Comparator.comparingInt(Integer::valueOf));

            BufferedWriter bw = new BufferedWriter(new FileWriter("number2.txt"));
            for (String number : list) {
                bw.write(number);
                bw.newLine();
                bw.flush();
            }
            bw.close();


        } else {
            System.out.println("文件不存在！");
        }
    }
}
