package com.smile.WriteTest.Other;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/10 9:49
 */

// 写一下常规的测试
public class Test02 {
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num = num + i;
            count = count++;  // temp = count； count = count+1 ； count = temp，count的引用又重新引向temp（0）

        }
        System.out.println("num*count=" + (num*count));

        int i = 5;
        int j = 10;
        System.out.println(i + ~j);   // 公式-n=~n+1,可推出~n=-n-1
    }
}
