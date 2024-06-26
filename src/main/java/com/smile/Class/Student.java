package com.smile.Class;

import lombok.Data;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/11 16:01
 */
import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;


    // 默认的构造方法
    Student(String str) {
        System.out.println("(默认)的构造方法 s = " + str);
    }

    // 无参构造方法
    public Student() {
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    // 有一个参数的构造方法
    public Student(char name) {
        System.out.println("姓名：" + name);
    }

    // 有多个参数的构造方法
    public Student(String name, int age) {
        System.out.println("姓名：" + name + " 年龄：" + age);
    }

    // 受保护的构造方法
    protected Student(boolean n) {
        System.out.println("受保护的构造方法 n = " + n);
    }

    // 私有构造方法
    private Student(int age) {
        System.out.println("私有的构造方法 年龄：" + age);
    }

}

