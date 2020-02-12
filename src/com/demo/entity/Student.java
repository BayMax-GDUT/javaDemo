package com.demo.entity;

public class Student {

    private int age;

    private String name;

    private int id;

    private Student deskMate;

    @Override
    public String toString(){
        return "" + this.id + "," + this.name + "," + this.age;
    }


}
