package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 11:48
 */

/*当String对象进行"+"操作，编译时会将String类变为String Builder进行append()处理
 ，而append()方法的功能就是字符串拼接*/
public class String_int_Test {
        public static void main(String args[]) {
            String x="7";
            int y = 2;
            int z=2;
            System.out.println(x+y+z); //722
            System.out.println(y+z+x); //47
            System.out.println((y+z)+x); //47
            System.out.println(y+(x+z)); //272
        }
    }

