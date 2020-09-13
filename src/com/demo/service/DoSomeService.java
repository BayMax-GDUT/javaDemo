package com.demo.service;

import com.demo.sort.*;
import org.springframework.stereotype.Component;

/**
 * 测试spring aop
 */
@Component
public class DoSomeService {
    
    public void doSomething (String str) {
        System.out.println("do something");
    }
}
