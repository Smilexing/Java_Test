package com.smile.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/23 14:51
 */
//使用并发工具CountDownLatch：开启多个线程同时执行某个任务，等到所有任务执行完再执行特定操作
public class CountDownLatchDemo {
    static final int N = 4;
    static CountDownLatch latch = new CountDownLatch(N);

    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < N; i++) {
            new Thread(new Thread1()).start();
        }

        latch.await(1000, TimeUnit.MILLISECONDS); //调用await()方法的线程会被挂起，它会等待直到count值为0才继续执行;等待timeout时间后count值还没变为0的话就会继续执行
        System.out.println("task finished");
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + "starts working");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        }
    }
}