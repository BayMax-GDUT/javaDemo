package com.demo.designPatterns.singleton;

/**
 * 懒汉式
 * 线程安全
 * 在获取实例的方法加上线程锁确保线程安全
 */
public class LazySafe {

    private LazySafe () {}

    protected static LazySafe uniqueObject;

    public static synchronized LazySafe getLazySafe () {
        if (uniqueObject == null) {
            uniqueObject = new LazySafe();
        }
        return uniqueObject;
    }
}
