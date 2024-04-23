package com.smile.WriteTest.Exception;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 17:48
 */
//关于什么时候要执行外部的代码块
// 若catch块中，如果有throw 语句，则try...catch... finally块之外的代码不执行；否则需要执行外部代码。
public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException(); // 抛出 UnsupportedOperationException 异常
//            System.out.println("error1");    // 不会被执行，在编译器会直接报错
        } catch (UnsupportedOperationException e) { // 捕获 UnsupportedOperationException 异常
            System.out.println("error2");
        }
        System.out.println("error3");   //因为不是从catch中throw的，这里依旧可以执行到
    }
}

