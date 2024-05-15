package com.smile.WriteTest;

public class replaceTest {
    public static void main (String[] args) {
        String classFile = "com.jd.". replaceAll(".", "/") + "MyClass.class";
        //replaceAll的参数是正则表达式,而"."代表了全部的字符，因此会全部被替换成"/"。
        System.out.println(classFile);
    }
}
