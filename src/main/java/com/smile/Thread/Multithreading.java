package com.smile.Thread;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 11:12
 */
//定义了一个count静态全局变量，线程里面有一个方法，for循环进行自增 曾1000次。
//在 main方法中我们开启了两个线程执行，大家思考一下最后输出的结果是多少呢?
public class Multithreading {
    private static int count;

    private static class Thread1 extends Thread {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
