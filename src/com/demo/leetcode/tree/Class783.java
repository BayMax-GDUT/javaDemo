package com.demo.leetcode.tree;

public class Class783 {

    int min = Integer.MAX_VALUE;
    TreeNode pre;
    public int minDiffInBST(TreeNode root) {
        if (root == null) return 0;
        minDiffInBST(root.left);
        if (pre != null) {
            min = Math.min(Math.abs(root.val - pre.val), min);
        }
        pre = root;
        minDiffInBST(root.right);
        return min;
    }

}
