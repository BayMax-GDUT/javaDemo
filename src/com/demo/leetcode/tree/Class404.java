package com.demo.leetcode.tree;

public class Class404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return recursive(root.left, true) + recursive(root.right, false);
    }

    public int recursive (TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }
        return recursive(node.left, true) + recursive(node.right, false);
    }
}
