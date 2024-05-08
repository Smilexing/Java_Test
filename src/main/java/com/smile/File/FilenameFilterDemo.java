package com.smile.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/8 12:41
 */
//文件按照后缀进行过滤
public class FilenameFilterDemo {
    public static void main(String[] args) {

        File file = new File("E:\\桌面\\java\\java_sample");
        if (file.exists() && file.isDirectory()) {
            String[] allFileNames = file.list();
            for (String name : allFileNames) {
                System.out.println(name);

            }
            System.out.println("===============");

            String[] filterFileNames = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return (name.endsWith(".zip")) || name.endsWith(".txt");
                }


            });

            System.out.println("过滤后的文件列表：");
            for (String name : filterFileNames) {
                System.out.println(name);
            }
        }
    }
}
