package com.demo.framework.spring.primaryIoc;

class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql获取");
    }
}