package com.demo.framework.spring.primaryIoc;

public interface UserService {

    void setUserDao(UserDao userDao);

    void getUser();
}