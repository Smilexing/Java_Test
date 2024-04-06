package com.smile.single;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 13:38
 */
//饿汉式单例模式：在类加载时就创建实例
public class Single {
    private Single() {} // 私有化构造函数。

    private static Single s = new Single(); // 创建私有并静态的本类对象。

    public static Single getInstance() { // 定义公有并静态的方法，返回该对象。
        return s;
    }
}
