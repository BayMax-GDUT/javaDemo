package com.demo.leetcode.array;

public class Class27 {

    public int removeElement(int[] nums, int val) {
        // 操作的次数（目前发现的个数）
        int count = 0;
        // 当前索引
        int index = 0;
        if (nums.length == 1) {
            count = nums[0] == val ? 1 : 0;
            return nums.length - count;
        }
        while (index < nums.length - count - 1) {
            if (val == nums[index]) {
                nums[index] = nums[index] + nums[nums.length - count - 1];
                nums[nums.length - count - 1] = nums[index] - nums[nums.length - count - 1];
                nums[index] = nums[index] - nums[nums.length - count - 1];
                count++;
            } else {
                index++;
            }
        }
        return nums.length - count;
    }

}
