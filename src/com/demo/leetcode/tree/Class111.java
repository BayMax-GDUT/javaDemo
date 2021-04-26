package com.demo.leetcode.tree;

import java.util.logging.Level;

public class Class111 {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return getMinHeight(root); // 加上root的高度
    }

    public int getMinHeight (TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            return 1;
        } else if (node.right == null) {
            return getMinHeight(node.left) + 1;
        } else if (node.left == null) {
            return getMinHeight(node.right) + 1;
        } else {
            return Math.min(getMinHeight(node.left), getMinHeight(node.right)) + 1;
        }
    }
}
