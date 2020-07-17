package com.demo.multithreading;

public class SynchronizedExample {

    public static void func() {
        synchronized (SynchronizedExample.class) {
            try {
                Thread.sleep(2000);
                for (int i = 0; i < 10; i++) {
                    System.out.print(i + " ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
