package com.demo.leetcode.tree;

public class Class543 {

    int maxLength = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return maxLength;
        recursive(root);
        return maxLength;
    }

    public int recursive (TreeNode node) {
        if (node == null) return 0;
        int left = recursive(node.left);
        int right = recursive(node.right);
        maxLength = Math.max(maxLength,  left + right);
        return Math.max(left, right) + 1;
    }

}
