package com.smile;

public class VolatileTest {
    public static volatile int race = 0;

    public static void increase() {
        race++;
    }

    private static final int threads_count = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[threads_count];

        for (int i = 0; i < threads_count; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        // 等待所有线程执行完成
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final race value: " + race);  //19950,因为race++操作不是一个原子操作，导致一些线程对变量race的修改丢失
           }
}
