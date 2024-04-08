package com.smile.lambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 19:14
 */
public class lambdaTest02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        //    常规进行排序，用Collections调用sort排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

//        使用lambda来替换上面的匿名内部类的情况
        Collections.sort(list,(o1, o2) -> o1.compareTo(o2));


//        常规写法，用for来打印
        for(String s: list){
            System.out.println(s);
        }
//        lambda表达式，使用forEach来打印，快捷键：soutc
        list.forEach(System.out::println);
//        等同于用->表达
        list.forEach(s -> {
            System.out.println(s);
        });
    }


}
