package com.smile.WriteTest.Exception;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/14 21:31
 */

// 演示在try中有return情况
public class ExceptionTest1 {
    public static void main(String[] args) {
        int k = f_test();
        System.out.println(k);
    }

    public static int f_test(){
        int a = 0;
        try{
            a = 1;
            return a;   //先执行finally语句，再执行try或catch中的return
                            //此时的值是暂存再栈中的，若finally中有return则会覆盖暂存在栈的值
        }
        finally{
            System.out.println("It is in final chunk.");
            a = 2;
            return a;
        }
    }
}
