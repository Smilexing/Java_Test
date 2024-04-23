package com.smile.Lock;

import java.util.concurrent.Semaphore;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/23 14:58
 */
//使用Semaphore（信号量）来控制多个线程对共享资源的线程数量
public class SemaphoreDemo {
    public static void main(String[] args) {
        final int N = 7;        //每个线程表示一个工作任务
        Semaphore s = new Semaphore(3);     //许可证数量，允许同时有3个线程访问共享资源
        for(int i = 0; i < N; i++) {
            new Worker(s, i).start();   //将Semaphore对象传给7个Worker线程
        }
    }

    static class Worker extends Thread {
        private Semaphore s;
        private int num;
        public Worker(Semaphore s, int num) {
            this.s = s;
            this.num = num;
        }

        @Override
        public void run() {     //如果许可证可用，则线程可以继续执行任务；否则，线程会被阻塞，直到有许可证可用。
            try {
                s.acquire();    //acquire方法来获取许可证，许可证不可用，线程将被阻塞，直到有许可证可用为止
                System.out.println("worker" + num +  " using the machine");
                Thread.sleep(1000);
                System.out.println("worker" + num +  " finished the task");
                s.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
