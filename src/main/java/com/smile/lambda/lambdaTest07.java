package com.smile.lambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 20:02
 */

public class lambdaTest07 {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething(String s) {
                System.out.println(s);

            }
        };

        myInterface.doSomething("hello world");
        MyInterface myInterface1 = (s) -> System.out.println(s);
        myInterface1.doSomething("hello world");


    }
}
