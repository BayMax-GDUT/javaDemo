package com.demo.designPatterns.singleton;

/**
 * 双重校验锁
 * 线程安全
 * 只在没有实例化，需要实例化的时候才加入线程锁
 * 加上volatile，防止指令重排，且能保证该实例的可见性
 */
public class DoubleValidate {

    private DoubleValidate () {}

    protected static volatile DoubleValidate uniqueObject;

    public static DoubleValidate getSingleton () {
        if (uniqueObject == null) {
            synchronized (DoubleValidate.class) {
                if (uniqueObject == null) {
                    uniqueObject = new DoubleValidate();
                }
            }
        }
        return uniqueObject;
    }
}
