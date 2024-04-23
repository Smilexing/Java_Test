package com.smile.Lock;

import java.util.concurrent.locks.StampedLock;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/23 16:29
 */
//使用 StampedLock 的示例，实现了一个计数器
public class StampedLockDemo {
        private int count = 0;
        private StampedLock lock = new StampedLock();

        public int getCount() {     //getCount 方法首先尝试获取乐观读锁，并读取计数器的值
            long stamp = lock.tryOptimisticRead();
            int value = count;
            if (!lock.validate(stamp)) {        //通过 validate 方法验证数据的一致性
                stamp = lock.readLock();        //验证失败，则获取悲观读锁，并重新读取计数器的值
                try {
                    value = count;
                } finally {
                    lock.unlockRead(stamp);
                }
            }
            return value;
        }

        public void increment() {   //获取写锁，并对计数器进行递增操作
            long stamp = lock.writeLock();
            try {
                count++;
            } finally {
                lock.unlockWrite(stamp);
            }
        }
    }

