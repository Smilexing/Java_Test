package com.smile.Lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/23 16:10
 */

//读写锁控制对数据的读写操作，同时读不能同时写

public class ReadWriteLockDemo  {
    private Map<String, Object> data = new HashMap<>();     //使用 ReadWriteLock 来实现对 data 的并发访问控制。
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public Object get(String key) {     //get 方法获取读锁并读取数据，确保在读取数据时不会被写入操作所影响
        lock.readLock().lock();
        try {
            return data.get(key);
        } finally {
            lock.readLock().unlock();
        }
    }

    public void put(String key, Object value) {     //put 方法获取写锁并写入数据
        lock.writeLock().lock();
        try {
            data.put(key, value);
        } finally {
            lock.writeLock().unlock();
        }
    }
}