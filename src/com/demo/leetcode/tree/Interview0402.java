package com.demo.leetcode.tree;

public class Interview0402 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return recursive(nums, 0, nums.length - 1);
    }

    public TreeNode recursive (int[] nums, int start, int end) {
        if (start > end) return null;
        if (start == end) return new TreeNode(nums[start]);
        int middle = start + (end - start) / 2;
        TreeNode left = recursive(nums, start, middle - 1);
        TreeNode right = recursive(nums, middle + 1, end);
        TreeNode node = new TreeNode(nums[middle]);
        node.left = left;
        node.right = right;
        return node;
    }

}
