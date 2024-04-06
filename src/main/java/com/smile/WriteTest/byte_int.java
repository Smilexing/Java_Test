package com.smile.WriteTest;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 12:01
 */
public class byte_int {
    public static void main(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
        b3=(byte) (b1+b2);    //无final修饰的变量相加后会被自动提升为int型，byte需要强制转换（向下转型）-》int
        System.out.println(b3);
        System.out.println(b6);
        System.out.println(b3+b6);}
    }


