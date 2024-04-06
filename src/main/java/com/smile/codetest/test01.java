package com.smile.codetest;

import java.lang.reflect.Field;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 11:35
 */
public class test01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");
        //在这中间可以添加N行代码，但必须保证s引用的指向不变，最终将输出变为abcd
//        StringBuilder builder = new StringBuilder(s);  这种方式并没有真正去改变s对象的abc值，而是新建了一个builder对象来操作
//        builder.append("d");    输出：abc
//        Sting s1 = s.replace("abc","abcd");      在replace的底层是生成一个Stringbuffer来进行操作，输出：abc

//        使用反射,拿到value的字段去修改对应属性，没有修改s对象
        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".toCharArray());
        System.out.println(s);
    }
}
