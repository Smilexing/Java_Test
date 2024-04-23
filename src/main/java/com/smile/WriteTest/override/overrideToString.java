package com.smile.WriteTest.override;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/17 16:45
 */

// 改写toString方法
public class overrideToString {

    private int age;
    private String name;

    public overrideToString(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    public static void main(String[] args) {
        System.out.println(new overrideToString(18, "程序员大彬").toString());  //不改写默认输出对象地址
    }
}
