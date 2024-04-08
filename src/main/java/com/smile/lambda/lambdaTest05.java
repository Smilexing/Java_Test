package com.smile.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/8 19:43
 */
public class lambdaTest05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (Integer i : list) {
            sum +=i;
        }
        System.out.println(sum);

//        reduce是lambda中的累加器，其中第一个参数代表初始值，a-sum，b-i，定义规则，将结果赋值给第一个参数
        int sum2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);


    }
}
