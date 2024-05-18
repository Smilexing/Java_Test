package com.smile.springdemo.server;

import com.smile.springdemo.dao.AlphaDao;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 10:41
 */

@Service
// @Scope("prototype")     //开启，bean将不会以单例模式创建，而是每次获取都new一个，通常不建议开启
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;
    AlphaService() {
        System.out.println("实例化AlphaService");

    }
    @PostConstruct // 初始化完成立即调用该方法
    public void init() {
        System.out.println("初始化开始");

    }
    @PreDestroy  // 在销毁之前调用该方法
    public void destroy() {
        System.out.println("销毁实例");

    }

    public String find() {
        return alphaDao.select();
    }
}
