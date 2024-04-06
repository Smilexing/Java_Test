package com.smile.codetest;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 11:45
 */
public class test02 {
    public static void main(String[] args) {
        String s1 = new String("abc");  //生成两个对象，字符串常量abc放在字符串常量池，s1为String对象放在堆里面
        String s2 = "abc";  //去字符串常量池寻找abc，找到了并将其引用赋值给s2，未找到并在池中创建，s2是字符串常量对象
        System.out.println(s1==s2);   //false

//        s1 == s2? true or false

//intern方法首先会检查字符串常量池中是否存在"abc"
// 如果存在则返回该字符串引用，如果不存在，则把"abc"添加到字符串常中，并返回该字符串的引用。

        String s3 = s1.intern();  //s3即字符串常量池对象
//        s2 == s3? true or false
        System.out.println(s2==s3); //true
    }

}
