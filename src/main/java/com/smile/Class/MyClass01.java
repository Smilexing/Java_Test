package com.smile.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/11 15:56
 */
public class MyClass01 {
    // Class对象通过对象.getClass()获取
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Class<?> clazz2 = obj.getClass();
        System.out.println("Class通过对象.getClass()获取：" + clazz2.getName());
    }
}
