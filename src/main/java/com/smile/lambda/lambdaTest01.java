package com.smile.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 19:55
 */
//匿名内部类-》lambda表达式
public class lambdaTest01 {
    public static void main(String[] args) {
//        常规写法，创建一个新线程并重写run方法
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程的run方法被执行");
            }
        }).start();
    }*/

//    lambad写法，只关注参数列表，方法体
        new Thread(() -> {
            System.out.println("新线程的run方法被执行");
        }).start();

/*        int i = calculateNum(new IntBinaryOperator() {      //函数式编程，调用一个匿名内部类
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });*/
        int i = calculateNum((left, right) -> left + right);

    }
    public static  int calculateNum(IntBinaryOperator operator){    //这是一个匿名内部类
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }

}
