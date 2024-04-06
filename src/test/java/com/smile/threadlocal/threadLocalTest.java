package com.smile.threadlocal;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class threadLocalTest {
//     哪里体现了ThreadLocal，新建两个线程模拟多线程，其中为每个线程设置单独属性，再取出每个线程属性是唯一的
//    多线程环境下实现线程局部变量，确保每个线程都有自己独立的变量副本。
    public static void main(String[] args) {
        threadLocal tl = new threadLocal();

        // 设置线程局部变量的值
        tl.setName("张飞");
        System.out.println("线程1====" + tl.getName());


        // 创建一个新线程，并在新线程中设置和获取线程局部变量的值
        new Thread(() -> {
            tl.setName("孙尚香");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程2====" + tl.getName());
        }).start();
    }
}