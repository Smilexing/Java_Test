package com.smile.tasktimer.JDK.Proxy;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: 静态代理
 * @date 2024/6/10 21:52
 */

import com.smile.tasktimer.JDK.Common.OrderService;
import com.smile.tasktimer.JDK.OrderServiceImpl;
import com.smile.tasktimer.JDK.OrderServiceProxy;

/**
 * 代理实际是代替原对象处理操作，需要传入原对象才可以进行其中操作
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceProxy(target);
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
