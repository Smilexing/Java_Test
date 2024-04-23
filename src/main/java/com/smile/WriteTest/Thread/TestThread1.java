package com.smile.WriteTest.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/14 22:16
 */
public class TestThread1 {
    static int a = 0;
    static List<String> operations = new ArrayList<>();

    public static void main(String[] args) {
        Runnable runnable = () -> {
            boolean isOdd = false;
            for (int i = 1; i <= 2; ++i) {
//                synchronized (TestThread1.class) { // 使用同步块保证线程安全
                    if (i % 2 == 1)
                        isOdd = true;
                    else
                        isOdd = false;
                a += i * (isOdd ? 1 : -1);
            }
//            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();   //join() : 等待线程1执行结束,当前线程再执行后面的代码
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final result: " + a); // 输出最终的结果
    }
}
