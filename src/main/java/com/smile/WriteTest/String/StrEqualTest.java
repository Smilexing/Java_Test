package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 21:03
 */
public class StrEqualTest {

//    这一题考察的是创建对象的过程，下面创建test，testb 两个对象都会再执行name = "abc"
    private String name = "abc";
    public static void main(String[] args) {
        StrEqualTest Test = new StrEqualTest();
        StrEqualTest TestB = new StrEqualTest();

        String result = Test.equals(TestB) + ",";
        result += Test.name.equals(TestB.name) + ",";
        result += Test.name == TestB.name;
        System.out.println(result);
    }
}
