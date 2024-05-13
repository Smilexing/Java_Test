package com.smile.WriteTest;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/13 22:20
 */

//说明this()的作用
public class thisTest {
    static class Cat {
        String name;
        int age;
        Cat() {
            System.out.println("这是自定义的一个不带参数的构造函数");
        }

        public Cat(String name, int age) {
            this();            // 调用另一个不带参数的构造方法

            this.name = name;
            this.age = age;
            System.out.println(this.name + this.age + "岁了");
            System.out.println("这是自定义的一个带两个参数的构造函数");
        }
    }

}
