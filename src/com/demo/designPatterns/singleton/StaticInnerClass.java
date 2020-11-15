package com.demo.designPatterns.singleton;

/**
 * 静态内部类实现
 * 当 Singleton 类被加载时，静态内部类没有被加载进内存。
 * 只有当调用getStaticInnerClass方法从而触发InnerClass.INSTANCE时SingletonHolder才会被加载，此时JVM能确保INSTANCE只被实例化一次。
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 */
public class StaticInnerClass {

    private StaticInnerClass () {}

    protected StaticInnerClass uniqueObject;

    private static class InnerClass {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getStaticInnerClass () {
        return InnerClass.INSTANCE;
    }
}
