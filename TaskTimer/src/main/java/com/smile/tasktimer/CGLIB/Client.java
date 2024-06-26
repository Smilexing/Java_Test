package com.smile.tasktimer.CGLIB;


import com.smile.tasktimer.CGLIB.Common.UserService;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: CGLIB动态代理
 * @date 2024/6/10 22:30
 */
public class Client {
    public static void main(String[] args) {
        // 创建字节码增强器
        Enhancer enhancer = new Enhancer();
        // 告诉cglib要继承哪个类
        enhancer.setSuperclass(UserService.class);
        // 设置回调接口
        enhancer.setCallback(new TimerMethodInterceptor());
        // 生成源码，编译class，加载到JVM，并创建代理对象
        UserService userServiceProxy = (UserService)enhancer.create();

        userServiceProxy.login();
        userServiceProxy.logout();

    }
}
