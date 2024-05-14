package com.smile.File;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/9 16:20
 */
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

//java中的四种文件拷贝方式
import java.io.File;
import java.io.IOException;

public class FileCopyTest {

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "dest.txt";

        // 创建源文件
        createSourceFile(sourceFile);

        try {
            // 创建目标文件
            createEmptyFile(destFile);

            // 使用各种方法复制文件
            copyFileUsingStream(sourceFile, destFile);
            copyFileUsingChannel(sourceFile, destFile);
            copyFileUsingBufferedStream(sourceFile, destFile);
            copyFileUsingFilesClass(sourceFile, destFile);

            // 验证文件是否相同
            System.out.println("Files are identical: " + compareFiles(sourceFile, destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 创建源文件
    private static void createSourceFile(String filename) {
        try {
            File file = new File(filename);
            file.createNewFile();
            // 写入一些内容到源文件
            // 这里你可以根据需要写入一些内容到源文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 创建空的目标文件
    private static void createEmptyFile(String filename) {
        try {
            File file = new File(filename);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 比较两个文件是否相同
    private static boolean compareFiles(String file1, String file2) throws IOException {
        byte[] file1Bytes = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(file1));
        byte[] file2Bytes = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(file2));
        return Arrays.equals(file1Bytes, file2Bytes);
    }

    // 以下是你提供的四个方法的实现，需要将它们添加到这个类中

    // 使用 FileInputStream 和 FileOutputStream 进行文件拷贝
    public static void copyFileUsingStream(String sourceFile, String destFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(sourceFile);
        FileOutputStream outputStream = new FileOutputStream(destFile);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

    // 使用 FileChannel 进行文件拷贝
    public static void copyFileUsingChannel(String sourceFile, String destFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(sourceFile);
        FileOutputStream outputStream = new FileOutputStream(destFile);
        FileChannel sourceChannel = inputStream.getChannel();
        FileChannel destChannel = outputStream.getChannel();
        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        sourceChannel.close();
        destChannel.close();
        inputStream.close();
        outputStream.close();
    }

    // 使用 BufferedInputStream 和 BufferedOutputStream 进行文件拷贝
    public static void copyFileUsingBufferedStream(String sourceFile, String destFile) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

    //使用 Files 类的 copy
    public static void copyFileUsingFilesClass(String sourceFile, String destFile) throws IOException {
        Files.copy(Paths.get(sourceFile), Paths.get(destFile), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }
}


