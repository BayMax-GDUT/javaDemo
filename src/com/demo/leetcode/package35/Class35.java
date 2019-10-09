package com.demo.leetcode.package35;

public class Class35 {

    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] >= target)return i;
        }
        return nums.length;
    }
}
