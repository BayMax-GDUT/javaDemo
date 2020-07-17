package com.demo.multithreading;

import com.sun.deploy.cache.InMemoryLocalApplicationProperties;

public class MyRunnable implements Runnable{

    private Integer integer;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("hello" + this.integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public MyRunnable() {}

    public MyRunnable(Integer integer) {
        this.integer = integer;
    }
}
