package com.smile.threadlocal;

/**
 * @author Tom Smile
 * 需求：线程隔离
 * 在多线程并发的场景下，每个线程中的变量都是相互独立的
 * 线程A：设置变量1，获取变量2
 * 线程B：设置变量2，获取变量2
 */

// 参考连接：https://cloud.tencent.com/developer/article/1861402
public class ThreadLocalTest {
    // 变量
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    模拟线程不隔离情况

/*    public static void main(String[] args) {
        ThreadLocalTest ThreadLocalTest = new ThreadLocalTest();
        for (int i = 0; i < 5; i++) {       //循环创建 5 个线程
            new Thread(() -> {
                //这里并没有使用ThreadLocal来进行存储content字段，意在模拟线程不隔离的情况
                ThreadLocalTest.setContent(Thread.currentThread().getName() + "的数据");
                System.out.println("-----------------------------------------");

                //每个线程都共享同一个 ThreadLocalTest 实例，多个线程中设置 content 字段的值会相互覆盖
//                导致的情况就是每个线程输出的内容都是相同的，而不是每个线程设置的不同值
                System.out.println(Thread.currentThread().getName() + "\t  " + ThreadLocalTest.getContent());
                }, String.valueOf(i)).start();
        }
    }
    */

//    使用ThreadLocal实现线程隔离
//public static void main(String[] args) {
//    ThreadLocalTest ThreadLocalTest = new ThreadLocalTest();
//    ThreadLocal<String> threadLocal = new ThreadLocal<>();
//    for (int i = 0; i < 5; i++) {
//        new Thread(() -> {
//            threadLocal.set(Thread.currentThread().getName() + "的数据");
//            System.out.println("-----------------------------------------");
//            System.out.println(Thread.currentThread().getName() + "\t  " + threadLocal.get());
//        }, String.valueOf(i)).start();
//    }
//}

//  使用Synchronized同步来实现线程隔离

    public static void main(String[] args) {
        ThreadLocalTest ThreadLocalTest = new ThreadLocalTest();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (ThreadLocalTest.class) {
                    ThreadLocalTest.setContent(Thread.currentThread().getName() + "的数据");
                    System.out.println("-----------------------------------------");
                    System.out.println(Thread.currentThread().getName() + "\t  " + ThreadLocalTest.getContent());
                }
            }, String.valueOf(i)).start();
        }
    }


}
