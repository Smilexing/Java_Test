package com.smile.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/11 15:56
 */
public class MyClass {
        // Class对象通过类名.class获取
        public static void main(String[] args) {
            Class<?> clazz1 = MyClass.class;
            System.out.println("Class通过类名.class获取：" + clazz1.getName());
        }
    }
