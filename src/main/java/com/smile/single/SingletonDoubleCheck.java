package com.smile.single;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/6 13:51
 */

//双重检查锁定单例模式
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck INSTANCE;

    private SingletonDoubleCheck() {

    }

    public static SingletonDoubleCheck getInstance() {
        if(INSTANCE == null){
            synchronized (SingletonDoubleCheck.class) {
                if (INSTANCE == null) {   //确保只有在实例未创建时才会进入同步块创建实例
                    INSTANCE = new SingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

}
