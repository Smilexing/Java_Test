package com.smile.Thread;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 10:20
 */
// 说明线程的4种创建方式
//    继承Thread，创建多线程
public class Thread_1 extends Thread{
    
        public  Thread_1() {
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread() + ":" + i);
            }
        }

        public static void main(String[] args) {
             Thread_1 mThread1 = new  Thread_1();
             Thread_1 mThread2 = new  Thread_1();
             Thread_1  Thread_13 = new  Thread_1();
            mThread1.start();
            mThread2.start();
             Thread_13.start();
        }
    }
