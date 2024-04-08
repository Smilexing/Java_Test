package com.smile.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 20:18
 */
public class lambdaTest08 {
    public static void main(String[] args) {

//        工作流（业务场景中使用），判断list元素是否匹配并做操作，再进行排序

        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<String > list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("a")) {
                list2.add(s.toUpperCase());
            }
        }
        Collections.sort(list2);
        System.out.println(list2);

//        使用lambda 的filter进行过滤条件，再使用map进行每个元素处理，最后转换成相应格式
        List<String> list3 = list.stream().filter(s ->
                s.startsWith("a")
        ).map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(list3);
    }

}

