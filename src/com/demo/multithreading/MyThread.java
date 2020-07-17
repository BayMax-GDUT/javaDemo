package com.demo.multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        while (!interrupted()) {

        }
        System.out.println("end");
    }
}
