package com.smile.Thread;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 10:20
 */
// 说明线程的4种创建方式
//    继承Thread
public class Thread_1 extends Thread{


    @Override
    public void run() {
        System.out.println("hello i'am new thread...");
    }

    public static void main(String[] args) {
        new Thread_1().run();
    }
}
