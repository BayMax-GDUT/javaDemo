package com.demo.framework.spring.primaryIoc.config;

import com.demo.framework.spring.primaryIoc.UserService;
import com.demo.framework.spring.primaryIoc.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("com.demo.framework.spring..primaryIoc")
public class UserServiceConfig {

//    @Bean
//    public UserService userService() {
//        return new UserServiceImpl();
//    }
}
