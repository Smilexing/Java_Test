package com.smile.Thread.ShutdownHook;

import io.vertx.core.net.impl.pool.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/12 11:23
 */
public class Service {
    private ExecutorService executorService;

    public void start()  {
        executorService = Executors.newFixedThreadPool(5);
    }

    public void shutdown() {
        System.out.println("shut down services");
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(30, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(30, TimeUnit.SECONDS)) {
                    System.err.println("Executor did not terminate");

                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();

        }
    }
}
