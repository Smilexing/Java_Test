package com.smile.WriteTest.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/10 9:40
 */
public class Person {
    private String name = "Person";   //定义为私有成员变量，在这里考察继承的权限修饰符的范围
    int age = 0;

    public static void main(String[] args) {
        Person p = new Child();
        System.out.println(p.name);
    }


}

class Child extends Person{
    public String grade;

    public static void main(String[] args) {
        Person p = new Child();
//        System.out.println(p.name);    编译报错，子类子类访问父类中的私有成员变量
    }
}

