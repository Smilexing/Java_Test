package com.smile.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/11 15:57
 */
public class MyClass02 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.smile.Class.MyClass02");
            System.out.println("Class通过Class.forName()获取：" + clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
