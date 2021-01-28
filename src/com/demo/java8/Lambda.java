package com.demo.java8;

public class Lambda {

    public static void main(String[] args) {
        final int num = 1;
        MathOperation mathOperation = (int a, int b) -> a + b;
        MathOperation mathOperation1 = (a, b) -> a - b;
    }

}

interface MathOperation {
    int operation(int a, int b);
}
