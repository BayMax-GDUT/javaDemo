package com.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

public class Recursive {

    /**
     * 汉诺塔问题，递归实现
     * @param n 盘子个数
     * @param x 第一个柱子
     * @param y 第二个柱子
     * @param z 第三个柱子
     */
    private void hario(int n, String x, String y, String z) {
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
    private int fibonacci(int n) {
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

    /**
     * 斐波那契数列，进阶递归实现
     * 避免重复运算（f(19) + f(18) = f(17) + f(18) + f(18)）
     * @param n
     * @return
     */
    private int fibonacci2(int n) {
        if (n < 1) return 0;
        int[] array = new int[n + 1];
        return recursive(n, array);
    }
    private int recursive(int n, int[] array) {
        if (n == 1 || n == 2) return 1;
        if (array[n] != 0) return array[n];
        return recursive(n - 1, array) + recursive(n - 2, array);
    }

    /**
     * 斐波那契数列，动态规划实现
     * 自底向上
     * @param n
     * @return
     */
    private int fibonacci3(int n) {
        if (n < 1) return 0;
        int[] array = new int[n + 1];
        array[1] = 1;
        array[2] = 1;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    @Test
    public void test () {
        System.out.println(fibonacci3(6));
    }
}
