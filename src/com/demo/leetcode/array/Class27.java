package com.demo.leetcode.array;

public class Class27 {

    public int removeElement(int[] nums, int val) {

        int index = 0;  //已发现最后一个非目标数下标
        //一次迭代，如果出现非目标数，放到数组的头部
        for(int i = 0;i < nums.length;i++){

            if(nums[i] != val){
                nums[index] = nums[i];
                nums[i] = val;
                index++;
            }
        }
        //长度为最后一个非目标数的下标+1
        return index;
    }
}
