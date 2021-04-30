package com.demo.leetcode.tree;

public class JianZhi28 {

    public boolean isSymmetric(TreeNode root) {
        return root == null || recursive(root.left, root.right);
    }

    public boolean recursive (TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val == node2.val) {
            return recursive(node1.left, node2.right) && recursive(node1.right, node2.left);
        }
        return false;
    }
}
