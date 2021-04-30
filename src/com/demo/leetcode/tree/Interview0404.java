package com.demo.leetcode.tree;

public class Interview0404 {

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
        if (Math.abs(right - left) >= 2) balanced = false;
        return Math.max(left, right) + 1;
    }

}
