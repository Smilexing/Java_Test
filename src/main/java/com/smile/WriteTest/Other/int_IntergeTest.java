package com.smile.WriteTest.Other;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 17:25
 */
public class int_IntergeTest {
    public static void main(String[] args) {
        int a=257;
        Integer b=257;
        Integer c=257;
        Integer b2=57;
        Integer c2=57;
        System.out.println(a==b);   // 自动拆箱，integer会自动拆箱转换为int，再比较内容
//        System.out.println(a.equals(b));      编译出错，基本类型不能调用equals()
        System.out.println(b.equals(257.0));
        System.out.println(b==c);
        System.out.println(b2==c2);

    }
}
