package com.smile.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/23 11:14
 */

// Executor 创建线程
public class Thread_5 {
    public static void main(String[] args) {
        //获取ExecutorService实例，生产禁用，需要手动创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        //提交任务
        executorService.submit(new RunnableDemo());
    }
}

class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("大彬");
    }
}
