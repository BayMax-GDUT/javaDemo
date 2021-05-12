package com.demo.leetcode.bitOperation;

public class Class461 {

    public int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        while (z > 0) {
            if (z % 2 == 1) count++;
            z /= 2;
        }
        return count;
    }

}
