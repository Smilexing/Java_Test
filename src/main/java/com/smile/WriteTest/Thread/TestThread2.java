package com.smile.WriteTest.Thread;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/9 10:03
 */
public class TestThread2 {
    public static void main(String[] args){
        new TestThread2().go();
    }
    public void go(){
        Runnable r=new Runnable(){
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
