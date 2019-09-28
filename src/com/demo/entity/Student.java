package com.demo.entity;

public class Student {

    private int age;

    private String name;

    private int id;

    private Student deskMate;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getDeskMate() { return deskMate; }

    public void setDeskMate(Student deskMate) { this.deskMate = deskMate; }

    public Student(){}

    public Student(int age,String name,int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        return "" + this.id + "," + this.name + "," + this.age;
    }


}
