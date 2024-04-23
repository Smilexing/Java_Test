package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/9 21:31
 */
public class StringBufferExample {
/*1、小于当前容量时，容量不变，默认为16.
2、大于当前容量，并且小于(当前容量+1)*2，则容量变为(当前容量+1)*2.
3、大于当前容量，并且大于(当前容量+)*2，则容量变为用户所设置的容量。*/
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abcd");
        StringBuffer sb2 = new StringBuffer();  // 返回默认的capacity：16
        StringBuffer sb3 = new StringBuffer(3);
        StringBuffer sb4 = new StringBuffer(3);
        StringBuffer sb5 = new StringBuffer(15);

        sb2.append("abcd");
        sb3.append("abcdefghi");
        sb4.append("abcd");
        sb5.append("abcdefg");

        System.out.println(sb1.length() + "~" + sb1.capacity());
        System.out.println(sb2.length() + "~~" + sb2.capacity());
        System.out.println(sb3.length() + "~~" + sb3.capacity());
        System.out.println(sb4.length() + "~" + sb4.capacity());
        System.out.println(sb5.length() + "~" + sb5.capacity());
    }
}

