package com.simon.javase.file_io;

import java.io.*;

/**
 * 159_复制多级目录
 */
public class IODemo20 {
    public static void main(String[] args) throws IOException {
        //获取源文件和输出文件
        File srcFile = new File("copy");
        File outFile = new File("JavaSEDemo");
        if (srcFile.exists()) {
            copyFolder(srcFile, outFile);
        }
    }

    private static void copyFolder(File srcFile, File outFile) {
        if (srcFile.isDirectory()) {
            String name = srcFile.getName();
            File outFolder = new File(outFile, name);
            //判断是否存在文件夹,如果不存在，则创建文件夹 复制文件夹
            if (!outFolder.exists()) {
                outFolder.mkdirs();
            }
            //遍历srcFile下的文件
            File[] files = srcFile.listFiles();
            if (files != null && files.length != 0) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        copyFolder(f, outFolder);
                    } else {
                        copyFile(f, new File(outFolder, f.getName()));
                    }
                }
            }
        } else {
            copyFile(srcFile, new File(outFile, srcFile.getName()));
        }
    }

    /**
     * 复制文件
     *
     * @param f
     * @param file
     */
    private static void copyFile(File f, File file) {
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
