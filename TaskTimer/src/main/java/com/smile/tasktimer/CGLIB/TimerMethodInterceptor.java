package com.smile.tasktimer.CGLIB;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 实现五：使用CGLIB动态代理实现，重写intercept方法
 */
public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    /**
     * intercept
     * 参数1:目标对象
     * 参数2:目标方法
     *  参数3:目标方法调用时的实参
     *  参数4:代理方法
     */
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 前增强
        long begin = System.currentTimeMillis();
        // 调用目标
        Object retValue = methodProxy.invokeSuper(target, objects);
        // 后增强
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - begin) + "毫秒");
        // 一定要返回
        return retValue;
    }
}
