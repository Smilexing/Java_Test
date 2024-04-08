package com.smile.lambda;

import java.util.function.IntPredicate;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 20:16
 */

/*补充说明匿名内部类*/
public class innerClass {
    public static void printNum(IntPredicate predicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
/*        printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });*/

//        lambda写法
//        提参数列表- int value
//        提方法体- value % 2 == 0，这里方法体直接写在return中的
        printNum((int value)-> {
            return value % 2 == 0;
            });
    }

}
