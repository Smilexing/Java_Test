package com.smile.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 10:27
 */
//使用JDK自带的Executors来创建线程池对象
public class Thread_2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"thread run");
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            executor.execute(new Thread_2());
        }
        executor.shutdown();
    }
}
