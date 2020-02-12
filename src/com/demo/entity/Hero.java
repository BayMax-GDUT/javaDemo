package com.demo.entity;

public class Hero {

    private String name = "";

    private float hp;

    private int damage;

    public boolean isDead() {
        return 0 >= hp;
    }
}
