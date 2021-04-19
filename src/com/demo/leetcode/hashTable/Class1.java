package com.demo.leetcode.hashTable;

import java.util.HashMap;
import java.util.Map;

public class Class1 {
    public int[] twoSum(int[] nums, int target) {
//        for(int i = 0;i < nums.length - 1;i++){
//            for(int j = i + 1;j < nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    int[] result = new int[2];
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return null;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
