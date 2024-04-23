package com.smile.WriteTest.Static;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 20:49
 */
public class staticTest {
    public static int a = 1;    //
// 局部变量可以和类变量（成员变量）相同，使用标识符调用时，优先使用局部变量
    public static void main(String[] args) {
        int a = 10;
        a++;
        staticTest.a++;

        staticTest t = new staticTest();
        System.out.println("a="+a+"t.a="+t.a);
    }
}
