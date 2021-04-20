package com.demo.leetcode.array;

import org.junit.Test;

import java.util.Stack;

public class Class4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) return 0d;
        if (nums1 == null || nums1.length == 0) {
            int length = nums2.length;
            return length % 2 == 0 ? (double) (nums2[length / 2 - 1] + nums2[length / 2]) / 2 : nums2[length / 2];
        } else if (nums2 == null || nums2.length == 0) {
            int length = nums1.length;
            return length % 2 == 0 ? (double) (nums1[length / 2 - 1] + nums1[length / 2]) / 2 : nums1[length / 2];
        }
        Stack<Integer> stack = new Stack<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length && stack.size() < (nums1.length + nums2.length) / 2 + 1) {
            if (nums1[index1] <= nums2[index2]) {
                stack.push(nums1[index1++]);
            } else {
                stack.push(nums2[index2++]);
            }
        }
        if (index1 == nums1.length) {
            while (stack.size() < (nums1.length + nums2.length) / 2 + 1) {
                stack.push(nums2[index2++]);
            }
        } else if (index2 == nums2.length) {
            while (stack.size() < (nums1.length + nums2.length) / 2 + 1) {
                stack.push(nums1[index1++]);
            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            int result1 = stack.pop();
            int result2 = stack.pop();
            return (double) (result1 + result2) / 2;
        } else {
            return stack.pop();
        }
//        boolean isSingle = (nums1.length + nums2.length) % 2 == 1;
//        int midIndex = (nums1.length + nums2.length - 1) / 2;
//        int index1 = 0;
//        int index2 = 0;
//        double current = 0;
//        while (index1 < nums1.length && index2 < nums2.length) {
//            if (index1 + index2 == midIndex) break;
//            if (nums1[index1] >= nums2[index2]) {
//                current = nums2[++index2];
//            } else {
//                current = nums1[++index1];
//            }
//        }

    }

    @Test
    public void test() {
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1, 2}));
    }
}
