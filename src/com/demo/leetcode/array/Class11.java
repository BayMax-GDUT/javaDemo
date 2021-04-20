package com.demo.leetcode.array;

public class Class11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right) {
            result = Math.max(result, (right - left) * Math.min(height[right], height[left]));
            if (height[right] > height[left]) left++;
            else right--;
        }
        return result;
    }

}
