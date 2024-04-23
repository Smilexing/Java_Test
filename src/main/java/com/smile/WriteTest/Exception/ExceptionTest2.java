package com.smile.WriteTest.Exception;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 17:05
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(test(num));
    }

    public static int test(int b) {
        try {
            b += 10;
            return b;   //存在临时栈里面
        }
        catch (RuntimeException e) {
        }
        catch (Exception e2) {
        }
        finally {
            b += 10;
            return b;       //这里finally它会覆盖try中return的值，但需要先计算再返回
        }
    }
}

