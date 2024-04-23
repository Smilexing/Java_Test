package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 20:25
 */
public class strEqualTest1 {
    public static void main(String[] args)
    {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print(n1 == n2);     //这里比较的是地址相同
        System.out.print(",");
        System.out.println(n1 != n2);   //同样这里还是比较地址，注意这里不是比较内容
    }
}
