package com.smile.WriteTest;

public class StringTest {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};
    public static void main(String[] args) {

//      引号赋值和new的区别
        String a="My field1";
        String b="My field1";
        String c=new String("My field1");
        String d=new String("My field1");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));

//      常量池，运行时常量池
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + "and");
        System.out.println(ex.ch);


    }

    public void change(String str, char ch[]) {
        str = "task ok";  //这里的str并没有修改前面定义的str，而是在运行时常量池新创建了一个String变量
        ch[0] = 'g';
    }
}
