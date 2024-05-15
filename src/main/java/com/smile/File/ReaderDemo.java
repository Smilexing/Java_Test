package com.smile.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//使用Reader下的子类FileReader和BufferedReader来实现读取文件的内容并打印
public class ReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(
                    "src/main/java/com/smile/File/ReaderDemo.java"
            ));
            String result = null;
            while ((result = br.readLine()) != null) {  //readLine是按行读取，当读取到流的末尾时返回null，依据null来判断文件是否读取完毕
                System.out.println(result);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
