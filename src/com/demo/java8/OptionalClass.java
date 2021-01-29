package com.demo.java8;

import java.util.Optional;
import java.util.Random;

public class OptionalClass {

    public static void main(String[] args) {

        Random random = new Random();
        Integer integer = random.nextInt(2) % 2 == 0 ? null : 1;
        Optional<Integer> optional = Optional.ofNullable(integer);
        optional.map(i -> i.intValue()).orElseThrow(() -> new RuntimeException("aaa"));
    }
}
