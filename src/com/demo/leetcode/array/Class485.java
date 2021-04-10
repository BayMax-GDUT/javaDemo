package com.demo.leetcode.array;

public class Class485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentLength++;
            } else {
                max = Math.max(max, currentLength);
                currentLength = 0;
            }
        }
        max = Math.max(max, currentLength);
        return max;
    }

}
