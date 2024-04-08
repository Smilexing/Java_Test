package com.smile.lambda;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 19:49
 */
public class lambdaTest06 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");

//        按照长度进行分组，存储到一个HashMap中
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String s : list) {
            int length = s.length();
//           检测是否已经存在键为 length 的项，如果不存在，则创建一个新的空列表
            if (!groups.containsKey(length)) {
                groups.put(length, new ArrayList<>());
            }
//           获取键为 length 的列表，并将当前字符串 s 添加到该列表中
            groups.get(length).add(s);
        }
        System.out.println(groups);

//        使用的是Collectors（Stream包下）中的分组操作，参数就代表分组的依据，这里是字符串的长度，等价于s->s,length()
//        Collections--utils包下
        Map<Integer, List<String>> groups2 = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groups2);
    }
}
