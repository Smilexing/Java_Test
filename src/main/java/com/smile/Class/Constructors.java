package com.smile.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/11 16:07
 */

import java.lang.reflect.Constructor;

public class Constructors {
    public static void main(String[] args) throws Exception {
        // 加载Class对象
        Class<?> clazz = Class.forName("com.smile.Class.Student");

        // 获取所有公有构造方法
        System.out.println("**********************所有公有构造方法*********************************");
        Constructor<?>[] conArray = clazz.getConstructors();
        for (Constructor<?> c : conArray) {
            System.out.println(c);
        }

        // 获取所有构造方法（包括私有、受保护、默认、公有）
        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor<?> c : conArray) {
            System.out.println(c);
        }

        // 获取公有、无参的构造方法
        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor<?> con = clazz.getConstructor(null);
        System.out.println("con = " + con);
        // 调用构造方法
        Object obj = con.newInstance();

        // 获取私有构造方法，并调用
        System.out.println("******************获取私有构造方法，并调用*******************************");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        // 调用私有构造方法
        con.setAccessible(true); // 暴力访问(忽略掉访问修饰符)
        obj = con.newInstance('男');
    }
}

