package com.demo.entity;

public class User {

    private String name;

    private String password;

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }
}
