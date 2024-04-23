package com.smile.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 10:39
 */

//Callable 创建线程
public class Thread_4 {
    public static void main(String[] args) {
        Callable1 c = new Callable1();

        //异步计算的结果
        FutureTask<Integer> result = new FutureTask<>(c);

        new Thread(result).start();

        try {
            //等待任务完成，返回结果
            int sum = result.get();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}

class Callable1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
