package com.smile.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//使用OutputStream下的子类FileOutputStream来实现对文件的写入
//如果原文件存在内容，将会被覆盖，而不是追加
//如果该目录下不存在该文件，会先创建再进行写入
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/tomsmile/项目/Java_Test/test.txt");
            System.out.println("请输入内容：");
            String str = sc.nextLine();
            fos.write(str.getBytes());
            System.out.println("已保存！");

        } catch (IOException e) {
            e.printStackTrace();

        }
        finally {
            try {
                fos.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
            }
    }
}
