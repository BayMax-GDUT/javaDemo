package com.demo.leetcode.tree;

public class Class654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return recursive(nums, 0, nums.length - 1);
    }

    public TreeNode recursive(int[] array, int start, int end) {
        if (start > end) return null;
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        TreeNode mid = new TreeNode(array[maxIndex]);
        mid.left = recursive(array, start, maxIndex - 1);
        mid.right = recursive(array, maxIndex + 1, end);
        return mid;
    }

}
