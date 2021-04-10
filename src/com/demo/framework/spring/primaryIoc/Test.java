package com.demo.framework.spring.primaryIoc;

import com.demo.framework.spring.primaryIoc.config.UserServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Test {

//    @Autowired
//    UserService userService;

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//        userService.getUser();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserServiceConfig.class);
        UserServiceImpl userService = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }

}