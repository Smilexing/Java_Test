package com.smile.Thread;

import java.util.concurrent.FutureTask;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 11:15
 */
public class Tread_4_test {
    public static void main(String[] args){
        // 使用Lambda表达式创建Callable对象
        //使用FutureTask类来包装Callable对象
        FutureTask<Integer> future = new FutureTask<>(() -> 5);

        // Starting the thread with the FutureTask
        new Thread(future, "有返回值的线程").start();

        try {
            // The get() method will block until the computation has completed and then returns the result
            System.out.println("子线程的返回值：" + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

