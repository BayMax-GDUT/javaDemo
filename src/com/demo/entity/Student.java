package com.demo.entity;


public class Student {

    private int age;

    private String name;

    private int id;

    private Student deskMate;

    public void setAge (int age) {
        this.age = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setId (int id) {
        this.id = id;
    }
    public void setDeskMate(Student student){
        this.deskMate = deskMate;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public Student getDeskMate(){
        return this.deskMate;
    }

    public Student () {}

    public Student (int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return "" + this.id + "," + this.name + "," + this.age;
    }


}
