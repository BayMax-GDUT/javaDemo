package com.demo.leetcode.tree;

public class Class101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return recursive(root.left, root.right);
        }
    }

    public boolean recursive(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else {
            return node1.val == node2.val && recursive(node1.left, node2.right) && recursive(node1.right, node2.left);
        }
    }

}
