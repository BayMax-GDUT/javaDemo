package com.demo.designPatterns.singleton;

/**
 * 懒汉式
 * 线程不安全
 * 使用的时候才实例化一个实例
 */
public class Lazy {

    private Lazy() {}

    protected static Lazy uniqueObject;

    public static Lazy getLazy () {
        if (uniqueObject == null) {
            uniqueObject = new Lazy();
        }
        return uniqueObject;
    }
}
