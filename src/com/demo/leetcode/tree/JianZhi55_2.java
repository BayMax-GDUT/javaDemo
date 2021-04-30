package com.demo.leetcode.tree;

public class JianZhi55_2 {

    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        recursive(root);
        return balanced;
    }

    public int recursive (TreeNode node) {
        if (node == null) return 0;
        int left = recursive(node.left);
        int right = recursive(node.right);
        if (Math.abs(right - left) > 1) balanced = false;
        return Math.max(left, right) + 1;
    }

}
