package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodReference {

    @FunctionalInterface
    interface Reference<T> {
        T get();
    }

    public static MethodReference create(final Reference<MethodReference> reference) {
        return reference.get();
    }

    public static void staticReference(final MethodReference methodReference) {
        System.out.println("静态引用 " + methodReference.toString());
    }

    public void targetObjectReference(MethodReference methodReference) {
        System.out.println("特定实例引用 " + methodReference.toString());
    }

    public static void test(String str) {
        System.out.println("test" + str);
    }

    public void objectReference() {
        System.out.println("实例引用 " + this.toString());
    }

    public static void main(String[] args) {
        //构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
        MethodReference methodReference1 = MethodReference.create(MethodReference::new);
        MethodReference methodReference2 = MethodReference.create(MethodReference::new);
        MethodReference methodReference3 = MethodReference.create(MethodReference::new);
        MethodReference methodReference4 = new MethodReference();
        List<MethodReference> methodReferences = Arrays.asList(methodReference1,methodReference2,methodReference3,methodReference4);
        System.out.println("===================构造器引用========================");
        //静态方法引用：它的语法是Class::static_method，实例如下：
        methodReferences.forEach(MethodReference::staticReference);
        System.out.println("===================静态方法引用========================");
        //特定类的任意对象的方法引用：它的语法是Class::method实例如下：
        methodReferences.forEach(MethodReference::objectReference);
        System.out.println("==============特定类的任意对象的方法引用================");
        //特定对象的方法引用：它的语法是instance::method实例如下：
        methodReferences.forEach(methodReference4::targetObjectReference);
        System.out.println("===================特定对象的方法引用===================");
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
