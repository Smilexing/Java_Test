package com.smile.WriteTest.Exception;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 20:56
 */
// 演示在catch中包含return语句
public class ExceptionTest {
    public static String output = "";
    public static void foo(int i)
    {
        try
        {
            if (i == 1)
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            output += "2";
            return ;        //catch中包含return，它在捕获到异常将不会在进行外层操作，但仍会执行finally中的
        } finally
        {
            output += "3";
        }
        output += "4";
    }
    public static void main(String[] args)
    {
        foo(0);
        foo(1);
        System.out.println(output);
    }
}
