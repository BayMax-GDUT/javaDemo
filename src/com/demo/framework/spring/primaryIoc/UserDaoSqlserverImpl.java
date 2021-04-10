package com.demo.framework.spring.primaryIoc;

class UserDaoSqlserverImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Sqlserver获取");
    }
}