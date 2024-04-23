package com.smile.WriteTest.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 18:08
 */

//说明外部类，成员内部类，局部内部类各自使用权限修饰符的区别
public class ClassD {       //ClassD 为外部类，可以没有 public , 且只能带上 public， 不可以使用 protected,private 等其他

    // 成员内部类 E
    private static final class E {      // E 为成员内部类, 可以加上 public，protected，private 等和 static final

    }

    public static void main(String[] args) {


        class G {   // 局部内部类
        }
    }

    public void test() {

        final class H {     // 局部内部类 ， 不可以加上 static 和 public，protected，private 等, 可以带上 final
        }
        H h = new H();
    }
}

