package com.smile.WriteTest.String;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/27 8:38
 */
public class StringTest1 {
    String str=new String("hello");
    char[]ch={'a','b'};
    public static void main(String args[]){
        StringTest1 ex=new StringTest1();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");       //这里并没有
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
