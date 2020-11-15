package com.demo.designPatterns.singleton;

/**
 * 饿汉式
 * 线程安全
 * 初始化类的时候已经创建了一个实例
 */
public class Hungry {

    private Hungry () {}

    protected static Hungry uniqueObject = new Hungry();

    public static Hungry getHungry () {
        return uniqueObject;
    }
}
