package com.pangu.foying.web.commom.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 陈漫斌
 * @Description 线程锁工具
 * @Date 2019/8/6 8:51
 * @Modified By
 */
public final class ThreadLockUtil {
    //锁容器（可重入锁）
    private Map<String, ReentrantLock> lockMap = new HashMap<>();

    private static ThreadLockUtil instance = new ThreadLockUtil();

    private ThreadLockUtil(){}

    /**
     * 获取 线程锁工具对象
     * @return
     */
    public static ThreadLockUtil getInstance(){
        return instance;
    }

    /**
     * @Description 获取锁
     * @author 陈漫斌
     * @date 2019/8/6 8:59
     * @param key
     * @Modified By
     */
    public synchronized ReentrantLock getLock(String key) {
        ReentrantLock lock = lockMap.get(key);
        if (lock != null) {
            return lock;
        }
        //非公平
        lock = new ReentrantLock(false);
        lockMap.put(key, lock);
        return lock;
    }
}
