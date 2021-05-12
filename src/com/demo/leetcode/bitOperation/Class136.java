package com.demo.leetcode.bitOperation;

public class Class136 {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];
        }
        return nums[0];
    }
}
