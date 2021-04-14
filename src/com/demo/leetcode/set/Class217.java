package com.demo.leetcode.set;

import java.util.HashSet;
import java.util.Set;

public class Class217 {

    /**
     * 集合中存在就返回true，没有就一直插入，插入完成后还没有返回的就代表没有重复，返回false
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

}
