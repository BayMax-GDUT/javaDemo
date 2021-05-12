package com.demo.leetcode.array;

public class Class169 {

    public int majorityElement(int[] nums) {
        int count = 1;
        int target = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    target = nums[i + 1];
                }
            }
        }
        return target;
    }

}
