package com.smile.WriteTest.Other;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 20:59
 */
public class splitTest {
    public static void main(String[] args) {
        String str = "12,3";
        String str2 = "123";
        System.out.println(str.split(",").length);
        System.out.println(str2.split(",").length);
    }
}
