package com.demo.leetcode.tree;

import org.junit.Test;

public class Class108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return recursive(nums, 0, nums.length - 1);
    }

    public TreeNode recursive(int[] nums, int start, int end) {
        if (end < start) return null;
        int mid = (end - start) / 2 + start;
        TreeNode result = new TreeNode(nums[mid]);
        TreeNode left = recursive(nums, start, mid - 1);
        TreeNode right = recursive(nums, mid + 1, end);
        result.left = left;
        result.right = right;
        return result;
    }

    @Test
    public void test() {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode result = sortedArrayToBST(nums);
        output(result);
    }

    public void output(TreeNode node) {
        if (node != null) {
            output(node.left);
            System.out.println(node.val);
            output(node.right);
        }
    }
}
