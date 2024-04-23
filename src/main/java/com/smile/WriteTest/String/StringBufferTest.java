package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 19:42
 */
public class StringBufferTest {
        public static void main(String[] args) {
            StringBuffer a = new StringBuffer("A");
            StringBuffer b = new StringBuffer("B");
            operator(a, b);
            System.out.println(a + "," + b);
        }
        public static void operator(StringBuffer x, StringBuffer y) {
            x.append(y); y = x;
        }
    }

