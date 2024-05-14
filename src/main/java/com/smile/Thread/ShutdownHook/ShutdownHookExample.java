package com.smile.Thread.ShutdownHook;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/12 11:23
 */

// 基于JVM的shutdownHook可以在JVM关闭之前执行一些清理操作，可应用于注册中心主动下线节点
public class ShutdownHookExample {
    public static void main(String[] args) {
        Service service = new Service();
        service.start();

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            service.shutdown();}));

        System.out.println("Application is runnign");
    }
}
