package com.smile.springdemo.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/5/18 10:14
 */

@Repository("alphaMybatis")

public class AlphaDaoMybatisImpl implements AlphaDao {
    @Override
    public String select() {
        return "mybatis";
    }
}
