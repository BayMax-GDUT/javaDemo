package com.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

public class Recursive {

    @Test
    public static void main(String[] args) {
    }

    /**
     * 汉诺塔问题，递归实现
     * @param n 盘子个数
     * @param x 第一个柱子
     * @param y 第二个柱子
     * @param z 第三个柱子
     */
    private static void hario(int n, String x, String y, String z) {
        if (n < 1) {
            throw new RuntimeException("汉诺塔不能少于1个盘子");
        } else if (n == 1) {
            System.out.println("从" + x + "移动到" + z);
        } else {
            hario(n - 1, x, z, y);
            System.out.println("从" + x + "移动到" + z);
            hario(n - 1, y, x, z);
        }
    }

    /**
     * 斐波那契数列，递归实现
     * @param n
     * @return
     */
    private static int fibonacci(int n) {
        if (n < 1) {
            throw new RuntimeException("索引不能少于1");
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
