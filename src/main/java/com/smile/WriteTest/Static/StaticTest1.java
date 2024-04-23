package com.smile.WriteTest.Static;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/13 22:05
 */
public class StaticTest1 {

        static
        {
            System.out.println("Hi there");
        }

        public void print()
        {
            System.out.println("Hello");
        }

        public static void main(String args[])
        {
            StaticTest1 st1 = new StaticTest1();
            st1.print();
            StaticTest1 st2 = new StaticTest1();
            st2.print();
        }
    }

