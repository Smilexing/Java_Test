package com.smile.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 19:30
 */
public class lambdaTest03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = new ArrayList<>();
        for (String s : list2) {
            if (s.startsWith("a")) {
                list2.add(s);
            }
        }
//      使用lambda来做过滤，在筛选之后要将其转换为集合
        List<String> list3 = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());


    }

}
