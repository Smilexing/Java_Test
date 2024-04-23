package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 17:32
 */
public class StringTest {
    public static void main (String [] args) {
        String lx = "LeXin"; //创建一个新String对象LeXin，lx指向该对象，注意这里是使用引号创建String对象
        String nb = lx;
        lx = "Fenqile";     //这里引号创建了一个新的String对象Fenqile，lx改变指向对象
        System.out.println(nb);
        System.out.println(lx);
    }
}
