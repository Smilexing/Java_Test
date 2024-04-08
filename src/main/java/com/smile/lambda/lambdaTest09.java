package com.smile.lambda;

import java.util.Optional;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 20:18
 */
public class lambdaTest09 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");

            }
        });
        thread.start();

//        lambda创建一个线程
        Thread thread1 = new Thread(() -> System.out.println("hello world"));
        thread1.start();

        String str = "hello world";
        if (str != null) {
            System.out.println(str.toUpperCase());
        }


        Optional.ofNullable(str).map(String::toUpperCase).ifPresent(System.out::println);

    }
}
