package com.smile.tasktimer.JDK.Proxy;

import com.smile.tasktimer.JDK.Common.OrderService;
import com.smile.tasktimer.JDK.OrderServiceImpl;

import java.lang.reflect.Proxy;


/**
 * 实现四：使用动态代理，改写invoke方法逻辑，每次调用代理对象将调用invoke方法
 */
public class DynamicClient {
        public static void main(String[] args) {
            // 第一步：创建目标对象
            OrderService target = new OrderServiceImpl();
            // 第二步：创建代理对象

            /**
             * newProxyInstance
             * 参数1：指定类加载器（字节码加载到内存）
             * 参数2：接口类型
             * 参数3：调用处理器
             */
            OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(),
                    new TimerInvocationHandler(target));
            // 第三步：调用代理对象的代理方法
            // 调用代理对象中的代理方法，就会调用动态代理中的invoke方法（这样就实现了代码复用）
            orderServiceProxy.detail();
            orderServiceProxy.modify();
            orderServiceProxy.generate();
        }
    }

