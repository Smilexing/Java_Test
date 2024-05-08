package com.smile.File;

import java.io.File;
import java.io.IOException;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/8 12:24
 */
//文件创建，打印路径操作

public class FileDemo {
    public static void main(String[] args) {
//        以当前路径创建一个File对象，"."代表当前路径
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile().getParent());

        File newFile = new File("E:\\桌面\\java\\java_sample\\qst.txt");
        System.out.println("newFile 对象是否存在：" + newFile.exists());
        try {
            newFile.createNewFile();
        } catch (IOException e) {
        e.printStackTrace();
        }
        System.out.println("创建目录：" + newFile.mkdir());
        String[] fileList = file.list();
        System.out.println("当前路径下所有文件和路径如下：");
        for (String fileName : fileList) {
            System.out.println(fileName);

        }
        File[] roots = File.listRoots();
        System.out.println("系统的根路径");
        for (File root : roots) {
            System.out.println(root);
        }
    }

}
