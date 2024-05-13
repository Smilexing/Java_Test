package com.smile.WriteTest.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/9 10:20
 */

//说明内部类的几种情况（成员内部类、局部内部类），内部类如何拿到外部类的
public class innerClass {

        public class Inner{

            public Inner() {    //构造函数
            }
        }

    class Strange{      //成员内部类

        public  void test() {

             innerClass.Inner inner1 = new  innerClass().new Inner();   //外部类名.内部类名 对象名 = new 外部类名().new 内部类名();

             innerClass  innerClass = new  innerClass();
             innerClass.Inner inner2 =  innerClass.new Inner();
        }
    }

}
