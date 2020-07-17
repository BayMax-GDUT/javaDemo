package com.demo.multithreading;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

    @Override
    public Object call() {
        return new Object();
    }
}
