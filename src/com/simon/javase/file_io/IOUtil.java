package com.simon.javase.file_io;

import java.io.*;

/**
 * 159_复制多级目录 复制教学笔记里面的md和pdf文件
 */
public class IOUtil {
    public static void main(String[] args) throws IOException {
        //获取源文件和输出文件
        File srcFile = new File("/Users/simon/Documents/大数据学习/1.阶段一-Java基础/第二阶段");
        File outFolder = new File("JavaSEDemo1");
        if (!outFolder.exists()) {
            outFolder.mkdirs();
        }
        if (srcFile.exists()) {
            copyFolder(srcFile,outFolder);
        }
    }

    private static void copyFolder(File srcFile,File outFolder) {
        if (srcFile.isDirectory()) {
            String name = srcFile.getName();
            //判断是否存在文件夹,如果不存在，则创建文件夹 复制文件夹
            //遍历srcFile下的文件
            File[] files = srcFile.listFiles();
            if (files != null && files.length != 0) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        copyFolder(f,outFolder);
                    } else {
                        copyFile(f, new File(outFolder, f.getName()));
                    }
                }
            }
        } else {
            copyFile(srcFile, new File(outFolder, srcFile.getName()));
        }
    }

    /**
     * 复制文件
     *
     * @param f
     * @param file
     */
    private static void copyFile(File f, File file) {
        if (!(f.getName().endsWith("pdf") || f.getName().endsWith("md"))) {
            return;
        }
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
//            if (file.exists()) {
//                file.delete();
//            }

            bos = new BufferedOutputStream(new FileOutputStream(file));
            bis = new BufferedInputStream(new FileInputStream(f));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
