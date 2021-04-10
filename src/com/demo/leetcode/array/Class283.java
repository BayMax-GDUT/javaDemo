package com.demo.leetcode.array;

public class Class283 {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[i] + nums[j];
                        nums[j] = nums[i] - nums[j];
                        nums[i] = nums[i] - nums[j];
                        break;
                    } else if (j == nums.length - 1) {
                        return;
                    }
                }
            }
        }
    }

}
