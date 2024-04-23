package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/14 21:50
 */
public class CharToString {
    public static void main(String[] args)
    {
        char myChar = 'g';
        String myStr = Character.toString(myChar);   //查看源码，toString调用String.valueOf()，而valueOf重载 返回不同的值
        System.out.println("String is: "+myStr);
        myStr = String.valueOf(myChar);
        System.out.println("String is: "+myStr);
        int i = myChar;
        myStr = String.valueOf(i);  //char变成 int 的时候才会变为对应的assic码
        System.out.println("String is: "+myStr);
    }
}