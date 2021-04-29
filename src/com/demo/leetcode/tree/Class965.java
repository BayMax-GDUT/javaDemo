package com.demo.leetcode.tree;

public class Class965 {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return false;
        return recursive(root, root.val);
    }

    public boolean recursive (TreeNode node, int val) {
        if (node == null) return true;
        if (node.val == val) {
            return recursive(node.left, val) && recursive(node.right, val);
        } else {
            return false;
        }
    }
}
