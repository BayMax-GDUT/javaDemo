package com.demo.leetcode.tree;

public class Interview1712 {

    TreeNode result;
    TreeNode current;
    public TreeNode convertBiNode(TreeNode root) {
        if (root == null) return null;
        convertBiNode(root.left);
        if (result == null) {
            result = root;
        } else {
            root.left = null;
            current.right = root;
        }
        current = root;
        convertBiNode(root.right);
        return result;
    }

}
