package com.demo.leetcode.tree;

public class Class530 {

    int minAbs = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        getMinimumDifference(root.left);
        if (pre != null) {
            minAbs = Math.min(Math.abs(root.val - pre.val), minAbs);
        }
        pre = root;
        getMinimumDifference(root.right);
        return minAbs;
    }

}
