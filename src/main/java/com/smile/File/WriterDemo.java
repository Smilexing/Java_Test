package com.smile.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/tomsmile/项目/Java_Test/test1.txt");
            System.out.println("请输入内容：");
            String str = scanner.nextLine();
            fw.write(str);
            System.out.println("已保存！");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
                scanner.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
