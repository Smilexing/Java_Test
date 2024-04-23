package com.smile.WriteTest;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/22 10:37
 */
public class syncTest {
    public void syncBlock(){
        synchronized (this){
            System.out.println("hello block");
        }
    }
    public synchronized void syncMethod(){
        System.out.println("hello method");
    }
}

