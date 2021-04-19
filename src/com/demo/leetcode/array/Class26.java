package com.demo.leetcode.array;

public class Class26 {

    public int removeDuplicates(int[] nums) {

        int a = 0;  //目前已完成的最后一个整数所在下标
        for(int num:nums){
            if(num != nums[a]){
                nums[a + 1] = num;
                a++;
            }
        }
        return a + 1;   //返回长度为最后一个数字的下标+1
    }
}
