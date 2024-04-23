package com.smile.Thread;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 10:30
 */
//实现Runable接口
public class Thread_3 implements Runnable{
    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        new Thread(new Thread_3()).start();
    }
}
