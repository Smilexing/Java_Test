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
public class Thread_4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a FutureTask that is associated with a Callable
        FutureTask<String> task = new FutureTask<>(new ThreadFuture());
        // Start a new Thread with the FutureTask
        new Thread(task).start();
        // Wait for the computation to complete and retrieve its result
        String message = task.get();
        System.out.println(message);
    }

    // Define the Callable class
    public static class ThreadFuture implements Callable<String> {
        @Override
        public String call() {
            return "hello callable";
        }
    }
}
