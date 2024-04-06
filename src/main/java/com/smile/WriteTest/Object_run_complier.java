package com.smile.WriteTest;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/4 13:17
 */
public class Object_run_complier {
        public static void main(String[] args){
            Integer var1=new Integer(1);
            Integer var2=var1;
            doSomething(var2);
            System.out.print(var1.intValue());
            System.out.print(var1==var2);
        }
        public static void doSomething(Integer integer){
            integer=new Integer(2);
        }
    }

