package com.demo.framework.spring.primaryIoc;

class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("oracle获取");
    }
}