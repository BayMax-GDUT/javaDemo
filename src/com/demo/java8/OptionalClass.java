package com.demo.java8;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class OptionalClass {

    public static void main(String[] args) {
        // 获取一个value为null的Option对象
        Optional<Object> nullOptional = Optional.empty();
        // 自定义插入一个value，如果该value为null，抛出NullPointerException异常
        Optional<Object> optional = Optional.of(new Object());
        // 自定义插入一个value，允许该value为null
        Optional<Object> nullableOptional = Optional.ofNullable(optional);
        // 获取Optional里的value，如果该value为null，抛出NoSuchElementException异常
        Object object = nullableOptional.get();
        // 检验一个Optional里的value是否为null，返回一个boolean值
        boolean b = nullableOptional.isPresent();
        // 参数为一个Consumer（有参无返回值的函数，参数为值的类型或父类），检验一个Optional里的value是否为null，如果不是，执行参数函数，如果是则不作任何操作
        nullableOptional.ifPresent(OptionalClass::consumer);
        // 参数为一个Predicate（有参返回boolean的函数，参数为值的类型或父类），如果值为null或Predicate函数计算值为false返回Optional.empty()，不为null则返回该对象
        nullableOptional.filter(OptionalClass::predicate);
        // 参数为一个Function（有参有返回值的函数，参数为值的类型或父类），如果值为null则返回Optional.empty()，否则返回一个新的Optional对象，新对象的值为旧对象的值作为参数执行Function函数的返回值（此返回值可为null）
        nullableOptional.map(OptionalClass::map);
        // 参数为一个Function（有参返回一个Optional类型的函数，参数为值的类型或父类），如果值为null则返回Optional.empty()，否则返回一个新的Optional对象，新对象的值为旧对象的值作为参数执行Function函数的返回值（此返回值不可null）
        nullableOptional.flatMap(OptionalClass::flatMap);
        // 参数与对象的值同类型，如果值为null则返回该参数，否则返回值
        object = nullableOptional.orElse(new Object());
        // 参数为一个Supplier（无参有返回的函数，返回值为值的类型或子类），如果值不为null则返回值，值为null则返回Supplier函数的返回值
        object = nullableOptional.orElseGet(OptionalClass::supplier);
        // 参数为一个Supplier（无参有返回的函数，返回值为Throwable的子类），如果值不为null则返回值，值为null则抛出Supplier所返回（Throwable的子类）的异常
        try {
            object = nullableOptional.orElseThrow(OptionalClass::supplier1);
        } catch (Throwable e) {

        }
    }

    public static void consumer(Object object) {
        System.out.println(object);
    }

    public static boolean predicate(Object object) {
        return object == null;
    }

    public static Object map(Object object) {
        return object;
    }

    public static Optional<Object> flatMap(Object object) {
        return Optional.ofNullable(object);
    }

    public static Object supplier() {
        return new Object();
    }

    public static Throwable supplier1() {
        return new RuntimeException();
    }
}
