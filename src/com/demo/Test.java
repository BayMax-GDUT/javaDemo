package com.demo;


import com.demo.entity.Hero;
import com.demo.multithreading.MyCallable;
import com.demo.multithreading.MyRunnable;
import com.demo.multithreading.MyThread;
import com.demo.multithreading.SynchronizedExample;

import javax.security.auth.Subject;
import java.util.*;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) {

        SynchronizedExample synchronizedExample1 = new SynchronizedExample();
        SynchronizedExample synchronizedExample2 = new SynchronizedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> synchronizedExample1.func());
        executorService.execute(() -> synchronizedExample2.func());
        executorService.shutdown();
    }
}
