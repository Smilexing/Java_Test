package com.smile.springdemo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 10:13
 */
@Repository
//标明优先级，因为这里存在两个实现类都继承AlphaDao，在管理Bean无法判断获取哪个bean
@Primary
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
