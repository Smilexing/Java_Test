package com.smile.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 19:36
 */
public class lambdaTest04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<Integer> list2 = new ArrayList<>();
        for (String s : list) {
            list2.add(s.length());
        }
//       lambada中需要使用转换、过滤等操作，都要先转换为stream，处理之后还需要再转回对应格式
//      lambda中使用map来将每个元素做一个转换操作
        List<Integer> list3 = list.stream().map(s->{
            return s.length();
        }).collect(Collectors.toList());
    }
}
