package com.smile.WriteTest.Thread;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 21:55
 */
public class TestThread {

//    这里没有使用.start方式启动（也就不是多线程）
//    手动调用run方法和普通方法调用没有区别（按照顺序执行）
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");

            }
        };
        Thread t = new Thread(runnable);
        t.run();  //这里并不是多线程，还是在当前线程中调用了run方法，需要等待
        System.out.println("bar");
    }
}
