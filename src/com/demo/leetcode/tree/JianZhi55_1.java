package com.demo.leetcode.tree;

public class JianZhi55_1 {

    public int maxDepth(TreeNode root) {
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
