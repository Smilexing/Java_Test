package com.smile.single;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 13:48
 */
//懒汉单例
public class SingletonLazy {
    private static volatile SingletonLazy INSTANCE;

    private SingletonLazy() {}   //私有化构造函数

    //每次获取实例都要进入同步方法
    public static synchronized SingletonLazy getInstance() {    //定义公有并静态的方法，返回该对象。

        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();   //创建私有并静态的本类对象
        }
        return INSTANCE;
    }
}



