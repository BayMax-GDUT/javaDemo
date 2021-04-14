package com.demo.leetcode.hashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class217 {

    /**
     * map中存在key就返回true，没有就一直插入，插入完成后还没有返回的就代表没有重复，返回false
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], null);
            }
        }
        return false;
    }

}
