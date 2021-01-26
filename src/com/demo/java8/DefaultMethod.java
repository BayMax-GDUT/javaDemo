package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DefaultMethod implements Interface1, Interface2 {

    @Override
    public void method() {
        /* 类自行重写该默认方法 */
        System.out.println("DefaultMethod");

        /* 通过super声明调用目标接口的默认方法 */
        Interface1.super.method();
        Interface2.super.method();
    }

    public static void main(String[] args) {
        Interface1.staticMethod();
        Interface2.staticMethod();
    }
}

interface Interface1 {

    default void method() {
        System.out.println("Interface1");
    }

    static void staticMethod() {
        System.out.println("static method");
    }
}

interface Interface2 {

    default void method() {
        System.out.println("Interface2");
    }

    static void staticMethod() {
        System.out.println("static method");
    }
}
